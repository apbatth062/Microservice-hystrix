package com.example.microserviceApiGateWay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback()
	{
		return "user service is down";
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback()
	{
		return "contact service is down";
	}


}
