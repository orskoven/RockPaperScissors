import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String rockPaperScissors(String player1, String player2, String player1name, String player2name) {
        String[] options = {"rock", "paper", "scissor"};
        String winCheck = (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[2])) ? player1name+" wins" :
                (player2.toLowerCase(Locale.ROOT).equals(options[0]) && player1.toLowerCase(Locale.ROOT).equals(options[2])) ? player2name + " wins" :
                (player1.toLowerCase(Locale.ROOT).equals(options[2]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player1name+ " wins" :
                        (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[2]))?player2name+" wins" :
                                (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[0]))?player1name+" wins" :
                                        (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player2name+" wins" :"draw";


                                        System.out.println(winCheck);
        return winCheck;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String nameInputPlayer1 = scanner.nextLine();
        System.out.println("Hello, and what's your name?");
        String nameInputPlayer2 = scanner.nextLine();
        int i = 0;
        do {
            System.out.println(nameInputPlayer1 + ", please make a choice:");
            String inputPlayer1 = scanner.nextLine();
            System.out.println(nameInputPlayer2 + ", please make a choice:");
            String inputPlayer2 = scanner.nextLine();
            System.out.println();
            rockPaperScissors(inputPlayer1, inputPlayer2,nameInputPlayer1,nameInputPlayer2);
            i++;
        } while (i < 3);
    }
}
