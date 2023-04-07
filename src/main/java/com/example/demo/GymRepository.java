package com.example.demo;

import model_classes.Gym;
import model_classes.Member;
import model_classes.Trainer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository

public class GymRepository {
    Map<String, Gym> gymsDb = new HashMap<>();
    Map<String, Member> membersDb = new HashMap<>();
    Map<String, Trainer> trainersDb = new HashMap<>();

    public void addGym(Gym gym) {
        gymsDb.put(gym.getGymId(), gym);
    }
    public void addMember(Member member) {
        membersDb.put(member.getMemberId(), member);
    }
    public void addTrainer(Trainer trainer) {
        trainersDb.put(trainer.getTrainerId(), trainer);
    }
    public Member getMemberTrainedByMostTrainers() {
        //for this function i will first calculate the number of trainers for each member
        //then i will find the member trained by the most trainers
        Map<Member, Integer> countOfTrainers = new HashMap<>();
        //this map will contain the count of trainers for each member
        for (Trainer trainer : trainersDb.values()) {
            for (Member member : trainer.getMembers()) {
                int count = countOfTrainers.getOrDefault(member, 0) + 1;
                countOfTrainers.put(member, count);
            }
        }
        //now from the countOfTrainers map i will get the most trained member
        Member mostTrainedMember = null;
        int maxTrainedBy = 0;
        for (Map.Entry<Member, Integer> entry : countOfTrainers.entrySet()) {
            if (entry.getValue() > maxTrainedBy) {
                maxTrainedBy = entry.getValue();
                mostTrainedMember = entry.getKey();
            }
        }
        return mostTrainedMember;
    }
    public int getNumMembersTrainedByTrainerInMultipleGyms() {
        Set<Member> MultiTrainers = new HashSet<>();

        for (Trainer trainer : trainersDb.values()) {
            Set<Gym> gyms = new HashSet<>(trainer.getGyms());

            if (gyms.size() > 1) {
                for (Member member : trainer.getMembers()) {
                    MultiTrainers.add(member);
                }
            }
        }

        return MultiTrainers.size();
    }

    public Gym getGymWithMostMembers() {
        Gym gymWithMostMembers = null;
        int maxMembers = 0;
        for (Gym gym : gymsDb.values()) {
            int numMembers = gym.getMembers().size();
            if (numMembers > maxMembers) {
                maxMembers = numMembers;
                gymWithMostMembers = gym;
            }
        }
        return gymWithMostMembers;
    }

}
