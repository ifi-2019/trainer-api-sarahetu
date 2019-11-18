package com.ifi.trainer_api.service;

import com.ifi.trainer_api.bo.Trainer;
import org.springframework.web.bind.annotation.GetMapping;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
}
