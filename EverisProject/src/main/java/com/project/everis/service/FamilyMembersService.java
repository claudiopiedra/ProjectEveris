package com.project.everis.service;

import java.util.List;

import com.project.everis.model.FamilyMembers;

public interface FamilyMembersService {

	public List<FamilyMembers> findAll();
	
	public FamilyMembers saveFamilymembers(FamilyMembers familyMembers);
			
	public FamilyMembers updateFamilyMembers(FamilyMembers familyMembers);
	
	public FamilyMembers findByFamilymemberid(int familymemberid);
	
	public void deleteFamilyMembers(int familymemberid);
}
