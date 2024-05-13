package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

	@Autowired
    private ApplicationContext context;
	//4-3
	@RequestMapping("/country")
	public Country getCountryIndia() {
        return (Country) context.getBean("country");
    }
	
	//4-4
	
	@RequestMapping("/countries")
	public List<Country> getAllCountries() {
		
		List<Country> countryList = context.getBean("countryList", List.class);
        return countryList;
    }
	
	
	//4-5
	 	@Autowired
	    private CountryService countryService;

	    @GetMapping("/countries/{code}")
	    public Country getCountry(@PathVariable String code) throws CountryNotFoundException  {
	        return countryService.getCountry(code);
	    }
	    
	   
}
