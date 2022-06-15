package com.example.demoOrmJPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "randomPicks")
public class RandomPicker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	@OneToOne
	@JoinColumn(name = "reward_id")
	private Reward reward;

	@NonNull
	@OneToOne
	@JoinColumn(name = "rewardReceiver_id")
	private RewardReceiver rewardReceiver;
	
	@ManyToOne
	@JoinColumn(name = "randomGroup_id")
	private RandomGroup rndGroup;
}
