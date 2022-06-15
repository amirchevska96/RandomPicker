package com.example.demoOrmJPA.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RewardGiver;
import com.example.demoOrmJPA.domain.Reward;
import com.example.demoOrmJPA.repository.RewardRepository;

@Service
public class RewardServiceImpl implements RewardService {
	@Autowired
	RewardRepository rewardRepo;
	List<Reward> rewards = new ArrayList<>(Arrays.asList());

	@Override
	public List<Reward> getAll() {
		// TODO Auto-generated method stub
		rewardRepo.findAll().forEach(rewards::add);

		return rewards;
	}

	@Override
	public Reward getById(Integer key) {
		// TODO Auto-generated method stub
		return rewardRepo.findById(key).get();
	}

	@Override
	public void add(Reward entity) {
		// TODO Auto-generated method stub
		rewardRepo.save(entity);
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		rewardRepo.deleteById(key);

	}

	@Override
	public void update(Reward entity) {
		// TODO Auto-generated method stub
		rewardRepo.save(entity);
	}

//	@Override
//	public void update(Integer id, Reward entity) {
//		// TODO Auto-generated method stub
//		rewardRepo.save(entity);
//
//	}

}
