package com.cognizant.springlearn;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.bean.AppConfig;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.controller.EmployeeController;
import com.cognizant.springlearn.controller.HelloController;

@SpringBootApplication
@ImportResource("classpath:country.xml") 
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	//Handson 2 -2
	private static void displayDate() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 LOGGER.info("START");
		 String dateString = "31/12/2018";
		    try {
		        Date parsedDate = format.parse(dateString);
		        System.out.println("Parsed date: " + parsedDate);
		       
	            LOGGER.debug("Parsed date:", parsedDate);
		    } catch (ParseException e) {
		        System.err.println("Error parsing date: " + e.getMessage());
		    }
		    LOGGER.info("END");
	}

	//Handson 2 -4
	 private static void displayCountry() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	        Country country = context.getBean("country", Country.class);
	        Country anotherCountry = context.getBean("country", Country.class);
	        LOGGER.debug("Country: {}", country.toString());
	  }
	
	
	 private static void displayCountries() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	        
	        ArrayList<Country> countryList = context.getBean("countryList", ArrayList.class);

	        LOGGER.debug("List of Countries:");
	        for (Country country : countryList) {
	            LOGGER.debug(country.toString());
	        }
	    }
	 
	 //handson 3 -1,2
	 
	 public static void displayEmployee() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		 
		 Employee emp = context.getBean("employee", Employee.class);
//		 System.out.println(emp.toString());
	 }
	 
 //handson 3 -3
	 
	 public static void displayEmployeeSkill() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		 
		 Employee emp = context.getBean("employeeSkill", Employee.class);
//		 System.out.println(emp.toString());
	 }
	 
	 //Handson 3-4
	 public static void displayEmployeeControllerAnnotation(ApplicationContext applicationContext) {
	        EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController.java");
//	        System.out.println("Loaded EmployeeController bean: " + employeeController);
	    }
	 
	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringLearnApplication.class, args);
//		SpringLearnApplication sp = new SpringLearnApplication();
		//Handson 2 -3
//		displayDate();
		//Handson 2 -4
//		displayCountry();
//		displayCountries();
		//handson 3-1 
//		displayEmployee();
//		displayEmployeeSkill();
		//hands on 3-4
//		System.out.println("Started");
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        displayEmployeeControllerAnnotation(applicationContext);
//        System.out.println("Done");
		
		//Handson 4-1
		
//		HelloController hello = new HelloController();
//		
//		hello.sayHello();
		
		
		
	}

}
