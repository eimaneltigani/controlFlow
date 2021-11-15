import java.util.*;
import java.util.Scanner;

public class lotteryNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        boolean cont;
        System.out.println("Do you wish to continue to the interactive portion? (Type yes or y if you would like to continue)");
        String answer = scanner.next();
        char userAnswer = answer.charAt(0);
        if (userAnswer == 'y') {
            cont = true;
        } else {
            cont = false;
            System.out.println("Please return later to complete the survey.");
        }

        while (cont) {
            System.out.println("Do you have a red car? (yes, no):");
            String redCar = scanner.next();
            System.out.println("What is the name of your favorite pet?");
            String favPet = scanner.next();
            char petLetter = favPet.charAt(3);
            System.out.println("What is the age of your favorite pet?");
            int petAge = scanner.nextInt();
            System.out.println("What is your lucky number?");
            int luckyNumber = scanner.nextInt();
            System.out.println("What is your favorite quarterback's jersey number?");
            int faveQb = scanner.nextInt();
            System.out.println("What is the two-digit model year of your car?");
            int carModel = scanner.nextInt();
            System.out.println("What is the first name of their favorite actor or actress?");
            String favActress = scanner.next();
            char actressLetter = favActress.charAt(0);
            System.out.println("Enter a random number between 1 and 50:");
            int ranNo= scanner.nextInt();


            int rand1 = (int) (Math.random() * 65 + 1);
            int rand2 = (int) (Math.random() * 50 + 1);

            // creating magic ball number
            int magicBall = luckyNumber * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }

            // 5 non-magic numbers
            int num1 = petLetter;
            while (num1 > 65) {
                num1 -= 65;
            }
            int num2 = carModel + luckyNumber;
            while (num2 > 65) {
                num2 -= 65;
            }
            int num3 = rand2 - rand1;
            if (num3 < 0 ) {
                num3 = Math.abs(num3);
            }
            int num4 = actressLetter;
            while (num4 > 65) {
                num4 -= 65;
            }
            int num5 = carModel + petAge;
            while (num5 > 65) {
                num5 -= 65;
            }


            System.out.println("Lottery numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " Magic ball: " + magicBall);
            System.out.println("Would you like to answer questions to generate another set of numbers (y or no)?");
            char cont2 = scanner.next().charAt(0);
            if (cont2 == 'y') {
                cont = true;
            } else {
                cont = false;
                System.out.println("Thank you for filling out the survey!");
            }

        }
    }
}

