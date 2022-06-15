package com.example.demoOrmJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoOrmJPA.domain.RewardGiver;

@Repository
public interface RewardGiverRepository extends JpaRepository<RewardGiver, Integer> {

}
