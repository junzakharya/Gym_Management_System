package model_classes;

import java.util.List;

public class Member {
    private String memberId;
    private List<Trainer> trainers;
    private Gym gym;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public Member(String memberId, List<Trainer> trainers, Gym gym) {
        this.memberId = memberId;
        this.trainers = trainers;
        this.gym = gym;
    }
}
