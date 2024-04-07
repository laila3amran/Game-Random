package org.GameRanmdom.ChallengeOrgan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient= new Patient("Amani",20,
                new Eye("left eye ","Short sighted","blue",true),
                new Eye("right eye","Normal","blue",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burned","White",40));
        System.out.println("Name: "+ patient.getName()  );
        System.out.println("Age : "+patient.getAge());
        Scanner scanner = new Scanner(System.in);
         boolean shouldFinish = false ;
         while (!shouldFinish){
             System.out.println("Choose an Organ "+
                     "\n\t 1-Left Eye"+
                     "\n\t 2-Right Eye"+
                     "\n\t 3-Heart "+
                     "\n\t 4-Stomach"+
                     "\n\t 5- Skin"+
                     "\n\t 6- Quit");
             int choice= scanner.nextInt();
             switch (choice){
                 case 1:
                     patient.getLeftEye().getDetails();
                     if (patient.getLeftEye().isOpened()){
                         System.out.println("\t\t 1-Close the Eye");
                         if (scanner.nextInt()==1){
                             patient.getLeftEye().Close();
                         }
                         else {
                             continue;
                         }
                     }else {
                         System.out.println("Open the eye");
                         if (scanner.nextInt()==1){
                             patient.getLeftEye().Open();
                         }
                         else {
                             continue;
                         }
                     }
                     break;

                 case 2:
                     patient.getRightEye().getDetails();
                     if (patient.getRightEye().isOpened()){
                         System.out.println("\t\t 1-Close the Eye");
                         if (scanner.nextInt()==1){
                             patient.getRightEye().Close();
                         }
                         else {
                             continue;
                         }
                     }else {
                         System.out.println("Open the eye");
                         if (scanner.nextInt()==1){
                             patient.getRightEye().Open();
                         }
                         else {
                             continue;
                         }
                     }
                     break;

                 case 3:
                     patient.getHeart().getDetails();
                     System.out.println("\t 1-Change the Heart rate");
                     if (scanner.nextInt()==1){
                         System.out.println("Enter the new Heart rate :");
                         int newHeartRate = scanner.nextInt();
                         patient.getHeart().setRate(newHeartRate);
                         System.out.println(" Heart rate changed to :"+patient.getHeart().getRate());


                     }else {
                         continue;
                     }
                     break;

                 case 4:
                     patient.getStomach().getDetails();
                     System.out.println("\t\t1-Digest");
                     if (scanner.nextInt()==1){
                         patient.getStomach().Digest();
                     }else {
                         continue;
                     }
                     break;

                 case 5:
                     patient.getSkin().getDetails();
                     break;

                 default:
                     shouldFinish =true;
                     break;

             }
         }
    }
}
