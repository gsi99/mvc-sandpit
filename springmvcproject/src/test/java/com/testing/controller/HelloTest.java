package com.testing.controller;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testShowMessage() {
        Hello controller = new Hello();
        ModelAndView modelAndView = controller.showMessage();
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String message = (String) modelAndView.getModel().get("message");
        assertNotNull(message);
	}

}
