package com.couponSystem.incomeMicroService.Controller;

import java.util.List;
import java.util.List;

import javax.annotation.Resource;

import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couponSystem.incomeMicroService.Service.IncomeServiceImpl;
import com.couponSystem.incomeMicroService.model.Income;
import com.google.gson.Gson;




@RestController
@RequestMapping("/income")
public class IncomeController {
	
	@Resource
	private IncomeServiceImpl serviceImpl ; 
	
	@PostMapping("/storeIncome")
	public ResponseEntity storeIncome(@RequestBody String jsonIncomeString) { 
		
		Gson gson = new Gson(); 
		Income incomeJason = gson.fromJson(jsonIncomeString, Income.class);
		
		try { 
			
			if(jsonIncomeString != null ) {
				
				serviceImpl.storeIncome(incomeJason);
				 
				return ResponseEntity.ok(HttpStatus.OK); 
				
			}
		} catch (Exception e) {
			return ResponseEntity.ok(HttpStatus.EXPECTATION_FAILED); 
		}
		return ResponseEntity.ok(HttpStatus.FAILED_DEPENDENCY); 
			
	}
	
		@GetMapping("/ViewAllIncomes")
	public ResponseEntity<List<Income>> viewAllIncome() {
		
		try {
			
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(serviceImpl.viewAllIncome(),HttpStatus.OK); 
			return result ; 
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(HttpStatus.EXPECTATION_FAILED); 
			return result ;
		}
		
	}
		
	@GetMapping("/ViewIncomesByCustomer")
	public ResponseEntity<List<Income>> viewIncomeByCustomer(@RequestBody String jsonIncomeString) {
		
		Gson gson = new Gson(); 
		Income incomeJason = gson.fromJson(jsonIncomeString, Income.class);
		
		
		try {
			
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(serviceImpl.viewIncomeByCustomer(incomeJason.getName()),HttpStatus.OK); 
			return result ; 
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(HttpStatus.EXPECTATION_FAILED); 
			return result ;
		}
		
	}
	
	@GetMapping("/ViewIncomesByCompany")
	public ResponseEntity<List<Income>> viewIncomeByCompany(@RequestBody String jsonIncomeString) {
		
		Gson gson = new Gson(); 
		Income incomeJason = gson.fromJson(jsonIncomeString, Income.class);
		
		try {
			
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(serviceImpl.viewIncomeByCompany(incomeJason.getName()),HttpStatus.OK); 
			return result ; 
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(HttpStatus.EXPECTATION_FAILED); 
			return result ;
		}
		
	}
	
	
	
	
	
	
	
	
	

}