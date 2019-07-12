package com.project.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.everis.model.Families;

@Repository
public interface FamiliesDao extends JpaRepository<Families, Integer> {

}
