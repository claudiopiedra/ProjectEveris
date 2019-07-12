package com.project.everis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.project.everis.model.Families;
import com.project.everis.service.FamiliesService;

@RestController
@RequestMapping(value = "families")
public class FamiliesRestController {

	@Autowired
	private FamiliesService familiesService;
	
	@GetMapping(value= "getfamilies")
	public List<Families> getFamilies(){
		return familiesService.findAll();
	}
	
	@PostMapping(value="postfamilies")
	public Families insertFamilies(@RequestBody Families families){
		return familiesService.saveFamilies(families);
	}
		
	@PutMapping(value= "putfamilies")
	public Families updateFamilies(@RequestBody Families families){
			return familiesService.updateFamilies(families);
	}
		
	@DeleteMapping("/deletefamilies/{familyid}")
	public void deleteFamilies(@PathVariable(name= "familyid") Integer familyid) {
		 familiesService.deleteFamilies(familyid);
	}
}
