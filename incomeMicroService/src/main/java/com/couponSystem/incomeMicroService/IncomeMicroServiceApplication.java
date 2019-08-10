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
		
//		IncomeRepository incomRepo = applicationContext.getBean(IncomeRepository.class); 
//		
//		
//		
//		for( int i = 0 ;i<=20 ;i++)
//		{ 
//			Income incomeTest = new Income();
//			Income incomeTest2 = new Income();
//			
//			Date Date = new Date();
//			
//			
//			incomeTest.setAmount(100);
//			incomeTest.setDescription(IncomeType.COMPANY_NEW_COUPON);
//			incomeTest.setName("Phobus");
//			incomeTest.setDate(Date.toString());
//			
//			incomRepo.save(incomeTest);
//			
//			incomeTest2.setAmount(50);
//			incomeTest2.setDescription(IncomeType.COMPANY_NEW_COUPON);
//			incomeTest2.setName("Noam");
//			incomeTest2.setDate(Date.toString());
//			
//			incomRepo.save(incomeTest2);
//			
//		}

		
		
		
	}

}
