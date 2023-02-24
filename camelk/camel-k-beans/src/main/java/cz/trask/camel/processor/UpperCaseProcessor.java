package cz.trask.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class UpperCaseProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		
		if (body != null) {
			exchange.getIn().setBody(body.trim().toUpperCase());
		}
	}

}
