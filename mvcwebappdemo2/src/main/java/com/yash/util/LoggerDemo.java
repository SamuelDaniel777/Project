package com.yash.util;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LoggerDemo {
	public Logger getLogger() {
		Logger logger=Logger.getLogger(Logger.class);
		return logger;
	}
}
