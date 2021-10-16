package com.yash.loggersdemo.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {
	
	
	public static void main(String[] args) {
		Logger logger= Logger.getLogger(Log4jDemo.class); 
		PropertyConfigurator.configure("log.properties");
		logger.trace("trace");
		logger.debug("debug");
		logger.info("Info message");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
		logger.fatal("fatal error");

	}

}
