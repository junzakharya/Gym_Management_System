package com.example.demo;

import model_classes.Gym;
import model_classes.Member;
import model_classes.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class GymService {
    @Autowired
    private GymRepository gymRepository;

    public void addGym(Gym gym) {
        gymRepository.addGym(gym);
    }
    public void addMember(Member member){
        gymRepository.addMember(member);
    }

    public void addTrainer(Trainer trainer){
        gymRepository.addTrainer(trainer);
    }

    public Member getMemberTrainedByMostTrainers(){
        return gymRepository.getMemberTrainedByMostTrainers();
    }

    public int getNumMembersTrainedByTrainerInMultipleGyms(){
       return gymRepository.getNumMembersTrainedByTrainerInMultipleGyms();
    }

    public Gym getGymWithMostMembers(){
        return gymRepository.getGymWithMostMembers();
    }
}
