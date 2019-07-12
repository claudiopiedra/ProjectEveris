package com.project.everis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.everis.dao.StudentsDao;
import com.project.everis.model.Students;

@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private StudentsDao studentsDao;
	
	@Override
	public List<Students> findAll() {
		return studentsDao.findAll();
	}
	
	@Override
	public Students saveStudents(Students students) {
		return studentsDao.save(students);
	}

	@Override
	public Students updateStudents(Students students) {
		return studentsDao.save(students);
	}

	@Override
	public Students findByStudentid(int studentid) {
		return studentsDao.findById(studentid).get();
	}

	@Override
	public void deleteStudents(int studentid) {
		studentsDao.deleteById(studentid);
	}

	

}
