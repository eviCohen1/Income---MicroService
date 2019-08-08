package com.couponSystem.incomeMicroService;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.couponSystem.incomeMicroService.model.Income;
import com.couponSystem.incomeMicroService.model.IncomeType;
import com.couponSystem.incomeMicroService.repository.IncomeRepository;

@SpringBootApplication
public class IncomeMicroServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(IncomeMicroServiceApplication.class, args);
		
		IncomeRepository incomRepo = applicationContext.getBean(IncomeRepository.class); 
		
		
		
		for( int i = 0 ;i<=20 ;i++)
		{ 
			Income incomeTest = new Income();  
			
			Date Date = new Date();
			
			
			incomeTest.setAmount(i);
			incomeTest.setDescription(IncomeType.COMPANY_NEW_COUPON);
			incomeTest.setName("Coupon " + i );
			incomeTest.setDate(Date.toString());
			
			incomRepo.save(incomeTest);
			
		}

		
		
		
	}

}
