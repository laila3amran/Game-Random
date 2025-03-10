package org.GameRanmdom.ChallengeOrgan;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }


    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Stomach is full");
        }
    }
    public void Digest(){
        System.out.println("Digesting being ....");
    }
}
