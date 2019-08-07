package com.couponSystem.incomeMicroService.Service;

import java.util.Collection;
import java.util.List;

import com.couponSystem.incomeMicroService.model.Income;

public interface IncomeSrevice {


	List<Income> viewAllIncome();

	List<Income> viewIncomeByCustomer(String customerName);

	List<Income> viewIncomeByCompany(String companyname);

	void storeIncome(Income income);
	
	

}
