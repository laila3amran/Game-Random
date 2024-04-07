package org.GameRanmdom.ChallengeOrgan;

public class Skin extends Organ {
    private String color ;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    public String getColor() {
        return color;
    }







    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Color :"+this.getColor());
    }
}
