package org.GameRanmdom.ChallengeOrgan;

public class Eye  extends Organ {
    private String Color ;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        Color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color :"+getColor());
    }

    public void Open(){
        this.setOpened(true);
        System.out.println(this.getName()+" opened");
    }
    public void Close(){
        this.setOpened(false);
        System.out.println(this.getName()+" closed");
    }

    public String getColor() {
        return Color;
    }


    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
