package com.costumes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.costumes.demo.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
