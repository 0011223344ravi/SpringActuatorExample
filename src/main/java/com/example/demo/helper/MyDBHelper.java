package com.example.demo.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHelper implements HealthIndicator {

	
 public static final String DB_Service ="Database Service";
	public boolean isHealthGood() {
		
		//custom logic we can write here 
		return false;
	}
	@Override
	public Health health() {
		 if(isHealthGood()) {
			 return Health.up().withDetail(DB_Service, "database service is running").build();
		 }
		 
		 return Health.down().withDetail(DB_Service, "database service is down").build();
		 
		 
	}

}
