import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        int[] scoreArray = new int[2];
        int i = 0;
        do {
            Random random = new Random();
            int[] diceOptions = {1, 2, 3, 4, 5, 6};
            int high = 5;
            int low = 0;
            int resultOfRollIndex = random.nextInt(high - low) + low;
            int chosenOption = diceOptions[resultOfRollIndex];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type if the dice roll is even or uneven");
            String userInput = scanner.nextLine().toLowerCase(Locale.ROOT);
            String result = null;
            String result2 = null;
            System.out.println(chosenOption);
            if (chosenOption % 2 == 0) {
                result = "even";
            } else {
                result = "uneven";
            }
            if (userInput.equals(result)) {
                System.out.println("you guessed right");
                scoreArray[0]++;
            } else {
                System.out.println("you guessed wrong");
                scoreArray[1]++;
            }

            Arrays.stream(scoreArray).count();
            if (i % 2 == 0) {
                if (scoreArray[1] > scoreArray[0]) {
                    System.out.println("you definitely you guessed wrong");
                } else {
                    System.out.println("you definitely you guessed right");
                }
            }





            i++;
        } while (i < 20);
    }
}
