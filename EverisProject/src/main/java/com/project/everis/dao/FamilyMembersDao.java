package com.project.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.everis.model.FamilyMembers;

@Repository
public interface FamilyMembersDao extends JpaRepository<FamilyMembers, Integer>{


}
