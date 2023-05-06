package com.costumes.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costumes.demo.model.Stock;
import com.costumes.demo.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	StockRepository sr;
	
	public List <Stock> getDetail()
	{
		return sr.findAll();
	}
	
	public Stock postDetail(Stock id)
	{
		return sr.save(id);
	}

	
}
