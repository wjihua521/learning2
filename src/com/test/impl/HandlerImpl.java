package com.test.impl;

import com.test.service.IHandler;

public class HandlerImpl implements IHandler {

	@Override
	public void process() {
		System.out.println("--test handlerImpl--");
	}

}
