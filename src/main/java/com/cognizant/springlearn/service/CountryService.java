package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	
	 @Autowired
	    private ApplicationContext context;

	 
	 public List<Country> getAllCountries() {
			
			List<Country> countryList = context.getBean("countryList", List.class);
	        return countryList;
	    }
	    

	    public Country getCountry(String code) {
	        List<Country> countries = getAllCountries();
	        return countries.stream()
	                .filter(c -> c.getCode().equalsIgnoreCase(code))
	                .findFirst()
	                .orElseThrow(() -> new CountryNotFoundException("Country with code " + code + " not found"));
	        }
}
