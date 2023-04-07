package com.example.demo;

import model_classes.Gym;
import model_classes.Member;
import model_classes.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gym")

public class GymController {
   @Autowired
    private GymService gymService;
   @PostMapping("/addGym")
   public void addGym(@RequestBody Gym gym) {
       gymService.addGym(gym);
   }
    @PostMapping("/addMember")
    public void addMember(@RequestBody Member member) {
        gymService.addMember(member);
    }
    @PostMapping("/addTrainer")
    public void addTrainer(@RequestBody Trainer trainer) {
        gymService.addTrainer(trainer);
    }
    @GetMapping("/memberTrainedByMostTrainers")
    public Member getMemberTrainedByMostTrainers() {
        return gymService.getMemberTrainedByMostTrainers();
    }
    @GetMapping("/numMembersTrainedByTrainerInMultipleGyms")
    public int getNumMembersTrainedByTrainerInMultipleGyms() {
        return gymService.getNumMembersTrainedByTrainerInMultipleGyms();
    }
    @GetMapping("/getGymWithMostMembers")
    public Gym getGymWithMostMembers(){
       return gymService.getGymWithMostMembers();
    }

}
