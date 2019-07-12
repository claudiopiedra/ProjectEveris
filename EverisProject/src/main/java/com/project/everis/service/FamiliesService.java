package com.project.everis.service;

import java.util.List;

import com.project.everis.model.Families;


public interface FamiliesService {
	
	public List<Families> findAll();
	
	public Families saveFamilies(Families families);
			
	public Families updateFamilies(Families families);
	
	public Families findByFamilyid(int familyid);
		
	public void deleteFamilies(int familyid);
	
}
