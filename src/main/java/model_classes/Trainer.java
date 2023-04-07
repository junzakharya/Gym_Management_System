package model_classes;

import java.util.List;

public class Trainer {
    private String trainerId;
    private List<Member> members;
    private List<Gym> gyms;

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }

    public Trainer(String trainerId, List<Member> members, List<Gym> gyms) {
        this.trainerId = trainerId;
        this.members = members;
        this.gyms = gyms;
    }
}
