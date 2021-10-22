package com.technicalhunger.restful;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path="/hello")
	public Map<String, String> helloAPI(){
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", "Hello From Technical Hunger!");
		return response;
	}
}
