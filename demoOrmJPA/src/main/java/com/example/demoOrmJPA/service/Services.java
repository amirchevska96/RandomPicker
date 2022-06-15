package com.example.demoOrmJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoOrmJPA.domain.RewardGiver;
import com.example.demoOrmJPA.domain.Reward;

@Service
public interface Services<K, E> {

	public List<E> getAll();

	public E getById(K key);

	public void add(E entity);

	public void delete(K key);

	public void update(E entity);

}
