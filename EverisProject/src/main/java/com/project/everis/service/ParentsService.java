package com.project.everis.service;

import java.util.List;

import com.project.everis.model.Parents;

public interface ParentsService {

	public List<Parents> findAll();
	
	public Parents saveParents(Parents parents);
			
	public Parents updateParents(Parents parents);
	
	public Parents findByParentid(int parentid);
		
	public void deleteParents(int parentid);
}
