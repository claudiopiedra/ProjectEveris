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

import com.project.everis.model.FamilyMembers;
import com.project.everis.service.FamilyMembersService;

@RestController
@RequestMapping(value="familymembers")
public class FamilyMembersRestController {

	@Autowired
	private FamilyMembersService familyMembersService;

	@GetMapping(value= "getfamilymembers")
	public List<FamilyMembers> getFamilyMembers(){
		return familyMembersService.findAll();
	}
	
	@PostMapping(value="postfamilymembers")
	public FamilyMembers insertFamilyMembers(@RequestBody FamilyMembers familyMembers){
		return  familyMembersService.saveFamilymembers(familyMembers);
	}
	
	@PutMapping(value= "putfamilymembers")
	public FamilyMembers updateFamilyMembers(@RequestBody FamilyMembers familymember){
			return familyMembersService.updateFamilyMembers(familymember);
	}
		
	@DeleteMapping("/deletefamilymembers/{familymemberid}")
	public void deleteFamilyMembers(@PathVariable(name= "familymemberid") Integer familymemberid) {
		familyMembersService.deleteFamilyMembers(familymemberid);
		 
	}

}

