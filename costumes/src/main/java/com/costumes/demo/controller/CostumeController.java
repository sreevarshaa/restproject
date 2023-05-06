package com.costumes.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String getName(@RequestBody CostumeModel a)
	{
	    cs.saveDetails(a);
	    return "Saved";
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
	
	@GetMapping("/text4/{field}")
	public List<CostumeModel> sortModel(@PathVariable String field)
	{
		return cs.sortCostume(field);
	}
	
	@GetMapping("/text5/{offset}/{pagesize}")
	public List<CostumeModel> paginfCostume(@PathVariable int offset,@PathVariable int pagesize)
	{
		return cs.pagingCostume(offset,pagesize);
	}
	
	@GetMapping("/text6/{offset}/{pagesize}/{field}")
	public List<CostumeModel> PagingAndSortCostume(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
	{
		return cs.PagingAndSortCostume(offset,pagesize,field);
	}
	
	@GetMapping("/text7")
	public List<CostumeModel>fetchCostumeByName(@RequestParam String prefix)
	{
		return cs.fetchCostumeByName(prefix);
	}
	
	@GetMapping("/text8/{colour}/{name}")
	public List<CostumeModel> fetchColourByName(@PathVariable String colour,@PathVariable String name)
	{
		return cs.fetchCostumeColour(colour,name);
	}
	
	@DeleteMapping("/text9/{name}")
	public String deleteCostumeByName(@PathVariable String name)
	{
		cs.deleteCostumesByName(name);
		return "deleted";
	}
	
	@PutMapping("/text10/{name}/{size}")
	public String updateCostumeByName(@PathVariable String name,@PathVariable String size)
	{
		cs.updateCostumesByName(name,size);
		return "updated";
	}
}

