package com.example.demoOrmJPA.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOrmJPA.domain.RewardGiver;
import com.example.demoOrmJPA.service.RewardGiverService;

@RestController
@RequestMapping("/v1/rewardGivers")
public class RewardGiverController {

	@Autowired
	RewardGiverService employeService;

	@RequestMapping
	public List<RewardGiver> getAllEmployees() {
		return this.employeService.getAll();
	}

	@RequestMapping(value = "/{id}")
	public RewardGiver getEmployeeById(@PathVariable(value="id") Integer id) {
		return employeService.getById(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateEmployee(@PathVariable(value="id") Integer id, @RequestBody RewardGiver entity) {
		this.employeService.update(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteEmployee(@PathVariable(value="id") Integer id) {
		this.employeService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addEmployee(@RequestBody RewardGiver entity) {
		this.employeService.add(entity);
	}
}
