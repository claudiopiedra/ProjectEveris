package com.project.everis.service;

import java.util.List;

import com.project.everis.model.Students;

public interface StudentsService {
	
	public List<Students> findAll();
	
	public Students saveStudents(Students students);
			
	public Students updateStudents(Students students);
	
	public Students findByStudentid(int studentid);
		
	public void deleteStudents(int studentid);

}
