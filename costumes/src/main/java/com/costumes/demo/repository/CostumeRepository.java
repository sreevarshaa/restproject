
package com.costumes.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.costumes.demo.model.CostumeModel;

@Repository
public interface CostumeRepository extends JpaRepository<CostumeModel,Integer>{
	@Query("select s from CostumeModel s where s.colour=?1 and s.name=?2")
	public List<CostumeModel>getCostumeByColour(String colour,String name);
	
	@Modifying
	@Query("delete from CostumeModel s where s.name=?1")
	public int deleteCostumeByName(String name);
	
	@Modifying
	@Query("update CostumeModel s set s.name=?1 where s.size=?2")
	public int updateCostumeByName(String name,String size);
	
	
	List<CostumeModel> findByNameStartingWith(String prefix);
	List<CostumeModel> findByNameEndingWith(String suffix);
	List<CostumeModel> findByColour(String colour);

	

}
