package com.project.everis.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentid;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateofbirth")
	private Date dateofbirth;

	@Column(name="otherstudentdetails")
	private String otherstudentdetails;
	
	@ManyToMany(mappedBy = "studentsreferences")
	@JsonIgnoreProperties("studentsreferences")
	private Collection<Parents> parentsReferences;
	
	@OneToMany(mappedBy = "studentsreferencestofamilymember", fetch = FetchType.EAGER, orphanRemoval = true)
	@JsonIgnoreProperties("studentsreferencestofamilymember")
	private List<FamilyMembers> studentReferencesToFamilyMembers;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
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

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getOtherstudentdetails() {
		return otherstudentdetails;
	}

	public void setOtherstudentdetails(String otherstudentdetails) {
		this.otherstudentdetails = otherstudentdetails;
	}

	public Collection<Parents> getParents() {
		return parentsReferences;
	}

	public void setParents(Collection<Parents> parents) {
		this.parentsReferences = parents;
	}

	
	
	
}
