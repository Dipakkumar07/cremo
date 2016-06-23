package com.peacock.stackdemo;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StringStack {

	ArrayList<String> StrStack = new ArrayList<String>();
	Logger logger = Logger.getLogger("String Stack class");

	public void push(String str) {
		if (str != null) {
			StrStack.add(str);
			logger.warning("Added-" + str);
		} else {
			logger.warning("Null" + str);
			logger.info("Null not allowed");
		}
	}

	public String pop() {
		String str = StrStack.get(StrStack.size() - 1);
		StrStack.remove(StrStack.size() - 1);
		logger.warning("Poped " + str);
		return str;
	}
}
