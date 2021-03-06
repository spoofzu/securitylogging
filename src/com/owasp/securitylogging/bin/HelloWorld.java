package com.owasp.securitylogging.bin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	public static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	
	public HelloWorld() {

		logger.info("It's alive!");
		
	}
	
	public static void main(String[] args) {
	
		try {
			
			new HelloWorld();
			
		}catch( Throwable t ) {
			t.printStackTrace();
			System.exit(10);
		}
	}

}
