package com.example.demoOrmJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RandomPicker;
import com.example.demoOrmJPA.repository.RandomPickerRepository;

@Service
public class RandomPickerServiceImpl implements RandomPickerService {
	@Autowired
	RandomPickerRepository randomPickerRepository;

	@Override
	public List<RandomPicker> getAll() {
		// TODO Auto-generated method stub
		return randomPickerRepository.findAll();
	}

	@Override
	public RandomPicker getById(Integer key) {
		// TODO Auto-generated method stub
		return randomPickerRepository.getById(key);
	}

	@Override
	public void add(RandomPicker entity) {
		// TODO Auto-generated method stub
		randomPickerRepository.save(entity);
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		randomPickerRepository.deleteById(key);
	}

	@Override
	public void update(RandomPicker entity) {
		// TODO Auto-generated method stub
		randomPickerRepository.save(entity);
	}

}
