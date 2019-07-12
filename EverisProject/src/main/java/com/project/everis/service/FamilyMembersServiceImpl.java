package com.project.everis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.everis.dao.FamilyMembersDao;
import com.project.everis.model.FamilyMembers;

@Service
public class FamilyMembersServiceImpl implements FamilyMembersService{

	@Autowired
	private FamilyMembersDao familyMembersDao;
	
	@Override
	public List<FamilyMembers> findAll() {
		return familyMembersDao.findAll();
	}
	
	@Override
	public FamilyMembers saveFamilymembers(FamilyMembers familyMembers) {
		return familyMembersDao.save(familyMembers);
	}

	@Override
	public FamilyMembers updateFamilyMembers(FamilyMembers familyMembers) {
		return familyMembersDao.saveAndFlush(familyMembers);
	}

	@Override
	public void deleteFamilyMembers(int familymemberid) {
		familyMembersDao.deleteById(familymemberid);
	}

	@Override
	public FamilyMembers findByFamilymemberid(int familymemberid) {
		return familyMembersDao.findById(familymemberid).get();
	}

	

}
