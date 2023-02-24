package cz.trask.camelk;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomStringsBean {
	
	private String generateRandomString(final int length) {
	    byte[] array = new byte[length];
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));

	    return generatedString;
	}

	public String getRandomString(int lenght) {
		return this.generateRandomString(lenght);
	}

}
