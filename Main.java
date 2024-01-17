/******************************Libraries****************************************/
import java.util.Random;
import java.util.Scanner;
/***********************Main Function******************************************/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("welcome");
        boolean PlayAgain = true;
        int score = 0;

        while (PlayAgain) {
            int RightNumber = random.nextInt(100);     // generate a random number with boudary of 100
            int Attempts = 0;
            System.out.println("/******Welcome to the Guessing Game*****/");
            System.out.println("Guess a Number between 0 and 100");
            System.out.println("Note: You have 5 attempts");

            while (Attempts < 5) {
                System.out.println("enter a number");
                int Guess = scanner.nextInt();
                scanner.nextLine();
                Attempts++;
                if (Guess == RightNumber) {
                    System.out.println("Congratulations!!, your answer is correct");
                    score++;
                } else if (Guess < RightNumber) {
                    System.out.println("Your answer is below the right answer");
                } else {
                    System.out.println("your answer is above the right answer");



                }
                if (Attempts >=5){
                    System.out.println("Game Over!! you reached the maximum number of trials the correct Number was: "+RightNumber);
            }

        }

            System.out.println("Do you want to play again (y/n)? ");
            String Retry= scanner.nextLine();
            PlayAgain = Retry.equalsIgnoreCase("Y");  //ignore any input rather than yes

    }
        System.out.println("Game over :( !! Your Score is "+score);
        scanner.close(); //Close the system
}
}