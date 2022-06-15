package com.example.demoOrmJPA.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RewardReceiver;
import com.example.demoOrmJPA.repository.RewardReceiverRepository;

@Service
public class RewardReceiverServiceIml implements RewardReceiverService {

	@Autowired
	RewardReceiverRepository otherEmployeesRepo;

	List<RewardReceiver> rewardReceiver = new ArrayList<>(Arrays.asList());

	@Override
	public List<RewardReceiver> getAll() {
		// TODO Auto-generated method stub
		otherEmployeesRepo.findAll().forEach(rewardReceiver::add);
		return rewardReceiver;
	}

	@Override
	public RewardReceiver getById(Integer key) {
		// TODO Auto-generated method stub

		return otherEmployeesRepo.findById(key).get();
	}

	@Override
	public void add(RewardReceiver entity) {
		// TODO Auto-generated method stub
		this.otherEmployeesRepo.save(entity);

	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		this.otherEmployeesRepo.deleteById(key);

	}

	@Override
	public void update(RewardReceiver entity) {
		// TODO Auto-generated method stub
		this.otherEmployeesRepo.save(entity);
	}

}
