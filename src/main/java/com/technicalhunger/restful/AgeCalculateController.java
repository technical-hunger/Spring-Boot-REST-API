package com.technicalhunger.restful;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technicalhunger.restful.service.AgeCalculateService;

@RestController
public class AgeCalculateController {

	@Autowired
	private AgeCalculateService ageCalculateService;
	
	@PostMapping("/age")
	public ResponseEntity<?> calculateAge(@RequestBody Map<String, String> request){
		
		Period period = ageCalculateService.calculateAge(request.get("dateOfBirth"));
		
		Map<String, Object> response = new HashMap<>();
		response.put("Years",period.getYears());
		response.put("Months",period.getMonths());
		response.put("Days",period.getDays());
		
		return new ResponseEntity<Map>(response, HttpStatus.OK);
	}
}
