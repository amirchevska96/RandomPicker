package com.example.demoOrmJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demoOrmJPA.domain.Reward;


@Repository
public interface RewardRepository extends JpaRepository<Reward, Integer> {

}
