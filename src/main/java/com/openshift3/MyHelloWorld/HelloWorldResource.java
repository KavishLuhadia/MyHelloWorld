package com.openshift3.MyHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
    @RequestMapping("/hello")
	public String firstResource() {
		
		return "Hello Openshift";
	}
}
