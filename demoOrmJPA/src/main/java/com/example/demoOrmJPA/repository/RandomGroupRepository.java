package com.example.demoOrmJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoOrmJPA.domain.RandomGroup;
@Repository
public interface RandomGroupRepository extends JpaRepository<RandomGroup, Integer>{

}
