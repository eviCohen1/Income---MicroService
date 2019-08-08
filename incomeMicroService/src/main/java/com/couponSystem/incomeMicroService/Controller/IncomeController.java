package com.couponSystem.incomeMicroService.Controller;

import java.util.List;
import java.util.List;

import javax.annotation.Resource;

import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity storeIncome(@RequestBody Income income) { 

		try { 
			
			if(income != null ) {
				
				serviceImpl.storeIncome(income);
				 
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
			
			System.out.println(result);
			return result ;
		}
		
	}
		
	@GetMapping("/ViewIncomesByCustomer/{customerName}")
	public ResponseEntity<List<Income>> viewIncomeByCustomer(@PathVariable("customerName") String customerName ) {
		
		System.out.println(customerName);
		
		try {
			
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(serviceImpl.viewIncomeByCustomer(customerName),HttpStatus.OK); 
			return result ; 
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(HttpStatus.EXPECTATION_FAILED); 
			return result ;
		}
		
	}
	
	@GetMapping("/ViewIncomesByCompany/{CompanyName}")
	public ResponseEntity<List<Income>> viewIncomeByCompany(@PathVariable("CompanyName") String companyName ) {
		
		System.out.println(companyName);
		
		try {
			
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(serviceImpl.viewIncomeByCustomer(companyName),HttpStatus.OK); 
			return result ; 
			
		} catch (Exception e) {
			// TODO: handle exception
			ResponseEntity<List<Income>> result = new ResponseEntity<List<Income>>(HttpStatus.EXPECTATION_FAILED); 
			return result ;
		}
		
	}
	
		
	}
	
	
	
	
	
	
	

