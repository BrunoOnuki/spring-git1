package br.com.BrunoOnuki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/ola")
	public String hello() {
		return "hello";
	}
	
}
