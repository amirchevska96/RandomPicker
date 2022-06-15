package com.example.demoOrmJPA.controller;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOrmJPA.domain.RandomPicker;
import com.example.demoOrmJPA.domain.Reward;
import com.example.demoOrmJPA.domain.RewardReceiver;
import com.example.demoOrmJPA.service.RandomPickerService;
import com.example.demoOrmJPA.service.RewardReceiverService;
import com.example.demoOrmJPA.service.RewardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/randompicks")
public class RandomPickerController {
	@Autowired
	RandomPickerService randomPickService;
	private final RewardReceiverService rewardReceiverService;
	private final RewardService rewardService;
//
//	List<Reward> rewards = rewardService.getAll();
//	List<RewardReceiver> rewardReceivers = this.rewardReceiverService.getAll();

	@RequestMapping(method = RequestMethod.POST)
	public void savePick() {
		List<Reward> rewards = rewardService.getAll();
		List<RewardReceiver> rewardReceivers = this.rewardReceiverService.getAll();
		Random rand = new Random();
		int bound = rewards.size();
		int randNumb;
		while (bound > 0) {
			randNumb = rand.nextInt(bound);
			randomPickService.add(new RandomPicker(rewards.get(randNumb), rewardReceivers.get(randNumb)));

			rewards.remove(randNumb);
			rewardReceivers.remove(randNumb);
			bound--;
			Collections.shuffle(rewards);
			Collections.shuffle(rewardReceivers);

		}
	}
}
