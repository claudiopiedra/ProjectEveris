package com.project.everis.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Families")
public class Families {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int familyid;
	
	@Column(name="familyname", length = 20)
	private String familyname;
	
	@OneToMany(mappedBy = "parentsreferencestofamily", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("parentsreferencestofamily")
	private Collection<Parents> familyreferencestoparents;
	
	@OneToMany(mappedBy = "familyMembersReferencestoFamily" , fetch = FetchType.EAGER)
	@JsonIgnoreProperties("familyMembersReferencestoFamily")
	private List<FamilyMembers> familiesReferencesToFamilyMenbers;

	public int getFamilyid() {
		return familyid;
	}

	public void setFamilyid(int familyid) {
		this.familyid = familyid;
	}

	public Collection<Parents> getParents() {
		return familyreferencestoparents;
	}

	public void setParents(Collection<Parents> parents) {
		this.familyreferencestoparents = parents;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

}
