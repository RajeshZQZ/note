package com.uiStudy.testPro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2_demo {
	private static Logger logger = LogManager.getLogger(log4j2_demo.class.getName());
	
	public static void main(String[] args) {
		
		logger.error("error信息");
		logger.info("info信息"); 
		logger.debug("debug信息"); 
		logger.warn("warn信息"); 
		logger.fatal("fatal信息");
		
	}

}
