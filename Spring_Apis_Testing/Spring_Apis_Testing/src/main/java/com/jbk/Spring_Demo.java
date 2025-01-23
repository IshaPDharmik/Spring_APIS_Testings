package com.jbk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3School")
public class Spring_Demo {

	@RequestMapping(value = "/Java", method = RequestMethod.GET)
	public String Java() {
		return "It is an All about of java ";
	}

	@RequestMapping(value = "/Python", method = RequestMethod.POST)
	public String Python() {
		return "It is an All about of python ";
	}

	@RequestMapping(value = "/AWS", method = RequestMethod.PUT)
	public String AWS() {
		return "It is an All about of aws ";
	}

	@RequestMapping(value = "/UI-UX", method = RequestMethod.DELETE)
	public String UIUX() {
		return "It is an All about of UI-UX ";
	}

}
