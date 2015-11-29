package com.springConst.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class boot {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		OutputHelper help=context.getBean("outputhelper",OutputHelper.class);
help.generateOutput();
	}

}
