package com.couponSystem.incomeMicroService.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.couponSystem.incomeMicroService.model.Income;
import com.couponSystem.incomeMicroService.repository.IncomeRepository;

@Service 
public class IncomeServiceImpl  implements IncomeSrevice{

	
	@Resource
	IncomeRepository repo ; 
	
	
	@Override
	public List<Income> viewAllIncome() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Income> viewIncomeByCustomer(String customerName) {
		
		List<Income> allIncome = repo.findAll(); 
		List<Income> result = new ArrayList<Income>(); 
		
		for (Income income : allIncome) {
			
			
			if(income.getName().equals(customerName))
			{ 
				result.add(income);
			}	
		}
		return result; 

	}

	@Override
	public List<Income> viewIncomeByCompany(String companyName) {
		
		List<Income> allIncome = repo.findAll(); 
		List<Income> result = new ArrayList<Income>();
		
		for (Income income : allIncome) {
			
			if(income.getName().equals(companyName)) 
			{ 
				result.add(income); 
			}
			
		}
		
		return result;
	}

	@Override
	public void storeIncome(Income income) {
		// TODO Auto-generated method stub
		
		repo.save(income) ; 
		
	}
	


}
