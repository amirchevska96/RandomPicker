package com.example.demoOrmJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOrmJPA.domain.RewardReceiver;
import com.example.demoOrmJPA.service.RewardReceiverService;

@RestController
@RequestMapping("/v1/rewardReceiver")
public class RewardReceiverController {
	@Autowired
	RewardReceiverService rewardReceiverService;

	@RequestMapping
	public List<RewardReceiver> getEmployees() {
		return rewardReceiverService.getAll();
	}

	@RequestMapping(value = "/{id}")
	public RewardReceiver getEmployeeById(@PathVariable(value = "id") Integer id) {
		return rewardReceiverService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateEmployee(@PathVariable(value = "id") Integer id, @RequestBody RewardReceiver entity) {
		this.rewardReceiverService.update(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Integer id) {
		this.rewardReceiverService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addEmployee(@RequestBody RewardReceiver entity) {
		this.rewardReceiverService.add(entity);
	}
}
