package com.yash.controller.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test {
	static Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.trace("Trace");
		logger.info("Info hello");
	}

}
