package com.project.everis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.everis.dao.FamiliesDao;
import com.project.everis.model.Families;

@Service
public class FamiliesServiceImpl implements FamiliesService{

	@Autowired
	private FamiliesDao familiesDao;
	
	@Override
	public List<Families> findAll() {
		return familiesDao.findAll();
	}
	
	@Override
	public Families saveFamilies(Families families) {
		return familiesDao.save(families);
	}

	@Override
	public Families updateFamilies(Families families) {
		return familiesDao.saveAndFlush(families);
	}

	@Override
	public void deleteFamilies(int familyid) {
		familiesDao.deleteById(familyid);
	}

	@Override
	public Families findByFamilyid(int familyid) {
		return familiesDao.findById(familyid).get();
	}


	
}
