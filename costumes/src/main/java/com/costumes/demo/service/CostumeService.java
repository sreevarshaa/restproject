package com.costumes.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
//import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.costumes.demo.model.CostumeModel;
import com.costumes.demo.repository.CostumeRepository;

import jakarta.transaction.Transactional;

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
	public List<CostumeModel> sortCostume(String field)
	{
		
		return cr.findAll(Sort.by(Direction.DESC,field));
	}
	public List<CostumeModel> pagingCostume(int offset,int pagesize)
	{
		Pageable paging=PageRequest.of(offset, pagesize);
		Page<CostumeModel>costumeData=cr.findAll(paging);
		List<CostumeModel>costumeList=costumeData.getContent();
		return costumeList;
	}
	public List<CostumeModel> PagingAndSortCostume(int offset,int pagesize,String field)
	{
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<CostumeModel>costumeData=cr.findAll(paging);
		List<CostumeModel>costumeList=costumeData.getContent();
		return costumeList;
	}
	public List<CostumeModel>fetchCostumeByName(String prefix)
	{
		return cr.findByNameStartingWith(prefix);
	}
	public List<CostumeModel>fetchCostumeColour(String colour,String name)
	{
		return cr.getCostumeByColour(colour,name);
	}
	@Transactional
	public int deleteCostumesByName(String name)
	{
		return cr.deleteCostumeByName(name);
	}
	
	@Transactional
	public int updateCostumesByName(String name,String size)
	{
		return cr.updateCostumeByName(name,size);
	}
	

}
