package com.project.everis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.everis.model.Students;
import com.project.everis.service.StudentsService;

@RestController
@RequestMapping(value="students")
public class StudentsRestController {
	
	@Autowired
	private StudentsService studentsService;
	
	@GetMapping(value= "getstudents")
	public List<Students> getStudents(){
		return studentsService.findAll();
	}
	
	@PostMapping(value="poststudents")
	public void insertStudents(@RequestBody Students students){
		 studentsService.saveStudents(students);
	}

	@PutMapping(value="putstudents")
	public void updateStudents(@RequestBody Students students){
			studentsService.saveStudents(students);
	}
		
	@DeleteMapping("/deletefamilies/{studentid}")
	public void deleteStudents(@PathVariable(name= "studentid") Integer studentid) {
		studentsService.deleteStudents(studentid);
	}
}
