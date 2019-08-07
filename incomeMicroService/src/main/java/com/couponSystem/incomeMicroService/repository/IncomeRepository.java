package com.couponSystem.incomeMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couponSystem.incomeMicroService.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long>{

}
