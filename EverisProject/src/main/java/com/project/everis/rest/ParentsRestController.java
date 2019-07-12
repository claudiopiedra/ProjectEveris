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

import com.project.everis.model.Parents;
import com.project.everis.service.ParentsService;

@RestController
@RequestMapping(value="parents")
public class ParentsRestController {

	@Autowired
	private ParentsService parentsService;
	
	@GetMapping(value= "getparents")
	public List<Parents> getParents(){
		return parentsService.findAll();
	}
	
	@PostMapping(value="postparents")
	public Parents insertParents(@RequestBody Parents parents){
		return parentsService.saveParents(parents);
	}
	
	@PutMapping(value= "putparents")
	public Parents updateParents(@RequestBody Parents parents){
			return parentsService.updateParents(parents);
	}	
		
	@DeleteMapping("/deleteparents/{parentid}")
	public void deleteParents(@PathVariable("parentid") Integer parentid) {
		parentsService.deleteParents(parentid);
	}
}
