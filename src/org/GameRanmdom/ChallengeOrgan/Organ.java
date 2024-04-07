package org.GameRanmdom.ChallengeOrgan;

public class Organ {
    public String name;
    public String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition "+this.getMedicalCondition());
    }

    public String getName() {
        return name;
    }


    public String getMedicalCondition() {
        return medicalCondition;
    }

}
