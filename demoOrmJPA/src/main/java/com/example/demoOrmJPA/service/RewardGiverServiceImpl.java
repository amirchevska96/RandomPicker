package com.example.demoOrmJPA.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RewardGiver;
import com.example.demoOrmJPA.repository.RewardGiverRepository;

@Service
public class RewardGiverServiceImpl implements RewardGiverService {

	@Autowired
	private RewardGiverRepository EmployeeRepo;

	List<RewardGiver> rewardGivers = new ArrayList<>(Arrays.asList());

	@Override
	public List<RewardGiver> getAll() {
		EmployeeRepo.findAll().forEach(rewardGivers::add);
		return rewardGivers;
	}

	@Override
	public RewardGiver getById(Integer key) {
		return EmployeeRepo.findById(key).get();
	}

	@Override
	public void add(RewardGiver entity) {
		this.EmployeeRepo.save(entity);

	}

	@Override
	public void delete(Integer key) {
		EmployeeRepo.deleteById(key);
	}

	@Override
	public void update(RewardGiver entity) {
		// TODO Auto-generated method stub
		EmployeeRepo.save(entity);

	}

//	@Override
//	public void update(Integer id, RewardGiver entity) {
////		RewardGiver employee;
////		int i = 0;
////		for (RewardGiver emp : rewardGivers) {
////			employee = rewardGivers.get(i);
////
////			if (employee.getId().equals(id)) {
////				rewardGivers.set(i, entity);
////			}
////			i++;
////		}
//
//		EmployeeRepo.save(entity);
//	}

}
