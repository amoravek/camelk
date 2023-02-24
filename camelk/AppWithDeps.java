import org.apache.camel.builder.RouteBuilder;
import cz.trask.camel.processor.UpperCaseProcessor;

public class AppWithDeps extends RouteBuilder {
  @Override
  public void configure() throws Exception {
    from("timer:tick")
    .setBody().simple("abc")
    .process(new UpperCaseProcessor())
    .to("log:info");
  }
}

