package hn.com.jf.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/divisionByZero")
	public String divisionByZero() {
		int value = 100 / 0;
		return "Ok";
	}
	
	@GetMapping("/numberFormat")
	public String numberFormat() {
		int value = Integer.parseInt("10x");
		return "Ok";
	}
	

}
