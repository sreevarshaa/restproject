package com.costumes.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costumes.demo.model.CostumeModel;
import com.costumes.demo.repository.CostumeRepository;

@Service
public class CostumeService {
	@Autowired
	CostumeRepository cr;
	
	public List<CostumeModel> setAll()
	{
		return cr.findAll();
	}
	public CostumeModel saveDetails(CostumeModel id) {
		return cr.save(id);
	}
	public void delete(int id)
	{
		cr.deleteById(id);
	}
	public CostumeModel update(CostumeModel id)
	{
		return cr.save(id);
	}

}
