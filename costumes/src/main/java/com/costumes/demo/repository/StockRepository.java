package com.costumes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.costumes.demo.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer>{

}
