package com.technicalhunger.restful.service;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Service;

@Service
public class AgeCalculateService {

	public Period calculateAge(String dateOfBirth) {
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.parse(dateOfBirth);
		return Period.between(dob, today);
	}
}
