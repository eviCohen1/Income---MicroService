package com.couponSystem.incomeMicroService.model;

public enum IncomeType {
	
	CUSTOMER_PURCHASE("AAAA"),COMPANY_NEW_COUPON("BBBB"),COMPANY_UPDATE_COUPON("CCCCC");  
	
	
	private String description; 
	
	private IncomeType(String description ) { 
		
		this.description = description; 
			
	}
	private String getDescription() { 
		
		return description ; 
	}


}
