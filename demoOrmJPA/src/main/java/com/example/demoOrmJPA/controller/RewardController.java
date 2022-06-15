package com.example.demoOrmJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOrmJPA.domain.Reward;
import com.example.demoOrmJPA.service.RewardService;

@RestController
@RequestMapping("/v1/rewards")
public class RewardController {
	@Autowired
	RewardService RewardService;

	@RequestMapping
	public List<Reward> getAllRewards() {
		return this.RewardService.getAll();

	}

	@RequestMapping(value = "/{id}")
	public Reward getRewardById(@PathVariable(value = "id") Integer id) {
		return RewardService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateEmployee(@PathVariable(value = "id") Integer id, @RequestBody Reward entity) {
		this.RewardService.update(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteReward(@PathVariable(value = "id") Integer id) {
		this.RewardService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addReward(@RequestBody Reward entity) {
		this.RewardService.add(entity);
	}
}