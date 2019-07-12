package com.project.everis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.everis.dao.ParentsDao;
import com.project.everis.model.Parents;

@Service
public class ParentsServiceImpl implements ParentsService {
	
	@Autowired
	private ParentsDao parentsDao;

	@Override
	public List<Parents> findAll() {
		return parentsDao.findAll();
	}
	
	@Override
	public Parents saveParents(Parents parents) {
		return parentsDao.save(parents);
	}

	@Override
	public Parents updateParents(Parents parents) {
		return parentsDao.save(parents);
	}

	@Override
	public Parents findByParentid(int parentid) {
		return parentsDao.findById(parentid).get();
	}

	@Override
	public void deleteParents(int parentid) {
		parentsDao.deleteById(parentid);
	}

	
}
