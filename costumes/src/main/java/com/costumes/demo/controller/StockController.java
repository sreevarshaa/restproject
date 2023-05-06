package com.costumes.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.costumes.demo.model.Stock;
import com.costumes.demo.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	StockService ss;
	
	@GetMapping("/get")
	public List<Stock> setAll()
	
	{
		return ss.getDetail();
	}
	
	@PostMapping("/get1")
	public Stock postDetail(@RequestBody Stock id)
	{
		return ss.postDetail(id);
	}
	
}
