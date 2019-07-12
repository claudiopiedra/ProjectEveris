package com.project.everis.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="FamilyMembers")
public class FamilyMembers  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="familymemberid")
	private int familymemberid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="familyid")
	@JsonIgnoreProperties("familiesReferencesToFamilyMenbers")
	private Families familyMembersReferencestoFamily;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parentid")
	@JsonIgnoreProperties("parentsReferencestoFamilyMembers")
	private Parents familymembersreferencestoparents;	
	
	@NotNull
	@Column(name="parentorstudentmember")
	private String parentorstudentmember;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentid")
	@JsonIgnoreProperties("studentReferencesToFamilyMembers")
	private Students studentsreferencestofamilymember;

	public int getFamilymemberid() {
		return familymemberid;
	}

	public void setFamilymemberid(int familymemberid) {
		this.familymemberid = familymemberid;
	}

	public Families getFamilies() {
		return familyMembersReferencestoFamily;
	}

	public void setFamilies(Families families) {
		this.familyMembersReferencestoFamily = families;
	}

	public Parents getParents() {
		return familymembersreferencestoparents;
	}

	public void setParents(Parents parents) {
		this.familymembersreferencestoparents = parents;
	}

	public String getParentorstudentmember() {
		return parentorstudentmember;
	}

	public void setParentorstudentmember(String parentorstudentmember) {
		this.parentorstudentmember = parentorstudentmember;
	}

	public Students getStudents() {
		return studentsreferencestofamilymember;
	}

	public void setStudents(Students students) {
		this.studentsreferencestofamilymember = students;
	}

	
	
}
