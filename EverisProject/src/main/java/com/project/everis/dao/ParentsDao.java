package com.project.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.everis.model.Parents;

@Repository
public interface ParentsDao extends JpaRepository<Parents, Integer>{

}
