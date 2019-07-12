package com.project.everis.model;


import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Parents")
public class Parents {

	@Id
	@Column(name="parentid", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int parentid;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="otherparentdetails")
	private String otherparentdetails;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("parentsReferences")
	@JoinTable(name="studentParents",
			joinColumns=@JoinColumn(name="parentid",
			referencedColumnName = "parentid"),
			inverseJoinColumns=@JoinColumn(name="studentid",
			referencedColumnName = "studentid"))
	private Collection<Students> studentsreferences;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="headoffamilyparentid")
	@JsonProperty("familyreferencestoparents")
	private Families parentsreferencestofamily;
	
	@OneToMany(mappedBy = "familymembersreferencestoparents",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("familymembersreferencestoparents")
	private List<FamilyMembers> parentsReferencestoFamilyMembers;

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOtherparentdetails() {
		return otherparentdetails;
	}

	public void setOtherparentdetails(String otherparentdetails) {
		this.otherparentdetails = otherparentdetails;
	}

	public Collection<Students> getStudents() {
		return studentsreferences;
	}

	public void setStudents(Collection<Students> students) {
		this.studentsreferences = students;
	}

	public Families getFamilyreferences() {
		return parentsreferencestofamily;
	}

	public void setFamilyreferences(Families familyreferences) {
		this.parentsreferencestofamily = familyreferences;
	}
	
	
	
	
}
