package com.costumes.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.costumes.demo.model.CostumeModel;

import com.costumes.demo.service.CostumeService;

@RestController
public class CostumeController {
	
	@Autowired
	CostumeService cs;
	@GetMapping("/text")
	public List <CostumeModel> setAll()
	{
		return cs.setAll();
	}
	@PostMapping("/text1")
	public CostumeModel getName(@RequestBody CostumeModel a)
	{
	     return cs.saveDetails(a);
	}
	@DeleteMapping("/text2/{id}")
	public String deleteById(@PathVariable int id)
	{
		cs.delete(id);
		return "Deleted";
	}
	@PutMapping("/text3")
	public CostumeModel update1(@RequestBody CostumeModel a)
	{
		return cs.update(a);
	}

}
