package com.example.demoOrmJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RandomGroup;
import com.example.demoOrmJPA.repository.RandomGroupRepository;

@Service
public class RandomGroupServiceImpl implements RandomGroupService {
	@Autowired
	RandomGroupRepository randomGroupRepository;

	@Override
	public RandomGroup getById(Integer key) {
		// TODO Auto-generated method stub
		return randomGroupRepository.getById(key);
	}

	@Override
	public void add(RandomGroup entity) {
		// TODO Auto-generated method stub
		randomGroupRepository.save(entity);

	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		randomGroupRepository.deleteById(key);
		;
	}

	@Override
	public void update(RandomGroup entity) {
		// TODO Auto-generated method stub
		randomGroupRepository.save(entity);
	}

	@Override
	public List<RandomGroup> getAll() {
		// TODO Auto-generated method stub
		return randomGroupRepository.findAll();
	}

}
