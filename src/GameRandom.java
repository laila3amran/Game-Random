import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class GameRandom {
    public static void main(String[] args) {

        System.out.println("Welcome to Wonderland !");
        System.out.println("May have your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hello" +name);
        System.out.println("Shall we start");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");

        int beginAnswer= scanner.nextInt();

        while (beginAnswer !=1){
            System.out.println("Shall we start");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            beginAnswer= scanner.nextInt();
        }

        Random random =new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please guess a number :");
        int userInput = scanner.nextInt();

        int timesTried =0;
        boolean hasWon=false;
        boolean shouldFinish=false;
        while (!shouldFinish){
            timesTried++;
            if (timesTried<5){
                if (userInput==x){
                    hasWon=true;
                    shouldFinish=true;
                } else if (userInput>x) {
                    System.out.println("Guess lower");
                    userInput=scanner.nextInt();
                    
                }else {
                    System.out.println("Guess higher");
                    userInput=scanner.nextInt();
                }
            }else {
                shouldFinish=true;
            }
        }


        if (hasWon){
            System.out.println("Congratulations! you have guessed in your  "+timesTried+" guess .");
        }else {
            System.out.println("Game Over !");
            System.out.println("the nember was :"+x);
        }


        /*
        System.out.println("welcome");
        System.out.println("What is your name ");
        Scanner scan = new Scanner(System.in);
        String UserName = scan.next();
        System.out.println("Hello " + UserName);
        System.out.println("should we start?");
        String PositiveAnswer = scan.next();

        switch (PositiveAnswer){
            case "yes" :
                Random random = new Random();
                int NumberRandom = random.nextInt(10);
                System.out.println("Guess the number");
                int GuessNumber = scan.nextInt();
                if(GuessNumber==NumberRandom){
                    System.out.println("Congratulation you are winer the number is " + NumberRandom);
                    break;
                } else if (GuessNumber!=NumberRandom) {
                    for (int i=0;i<5;i++){
                        System.out.println("Guess another time Mss "+UserName);
                        GuessNumber = scan.nextInt();
                        if (GuessNumber>NumberRandom){
                            System.out.println("Guess to lower");

                        }
                        if (GuessNumber<NumberRandom){
                            System.out.println("Guess to higher");
                        }
                    }
                    System.out.println("Game Over !");
                    break;

                }
                break;
            case "no" :
                System.out.println("Oups");
                break;
        }

    */

    }

}
