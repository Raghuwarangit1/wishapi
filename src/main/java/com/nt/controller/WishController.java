package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	@GetMapping("/")
public String getWish()
{
return "hi good moring raghu";	
}
}
