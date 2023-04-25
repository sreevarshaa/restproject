package com.costumes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.costumes.demo.model.CostumeModel;

@Repository
public interface CostumeRepository extends JpaRepository<CostumeModel,Integer>{

}
