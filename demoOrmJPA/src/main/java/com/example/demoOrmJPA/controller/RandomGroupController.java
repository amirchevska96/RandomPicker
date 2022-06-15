package com.example.demoOrmJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOrmJPA.domain.RandomGroup;
import com.example.demoOrmJPA.domain.RandomPicker;
import com.example.demoOrmJPA.service.RandomGroupService;
import com.example.demoOrmJPA.service.RandomPickerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/v1/randomGroups")
@RestController
public class RandomGroupController {
	@Autowired
	RandomGroupService randomGroupService;

	private final RandomPickerService randomPickerService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveGroup() {
		List<RandomPicker> randomPick = randomPickerService.getAll();
		randomGroupService.add(new RandomGroup(randomPick));
		
	}
}
