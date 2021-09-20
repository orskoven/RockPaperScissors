import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to Rock, Paper and Scissor,\nwhat's your name?");
        String nameInputPLayer1 = scanner.nextLine();
        int i = 0;
        do {

            System.out.println(nameInputPLayer1 + ", let me know if you want to play multiplayer" +
                    " \n(press 'X') or singleplayer (press 'Z')");
            String inputAnswerGameMode = scanner.nextLine();
            String messageGameModeChoice = (inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("X")) ?
                    "Get player 2 ready!"
                    : (inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("Z")) ?
                    "Be ready to be beaten!" : "Sorry, I didn't get that?";

            System.out.println(messageGameModeChoice);
            boolean checkTheInput = inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("Z") || (inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("X"));
            for (boolean t = checkTheInput; t; t = false) {

                if (inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("Z")) {

                    String nameInputPlayer2 = nameGenerator();
                    System.out.println("Hello and welcome to the single player game, my name is " +
                            nameInputPlayer2);
                    System.out.println("ok " + nameInputPLayer1 +
                            ", how many rounds would you like to play?");
                    int rounds = scanner.nextInt();
                    System.out.println("Before we begin, choose level of difficulty: press keys 0(easy) - 15(hard)");
                    double inputDifficultyLevel = scanner.nextDouble();
                    String roundsStatment = (rounds == 2) ?
                            "That's going to be a quick one" :
                            (rounds < 6) ? "They call me scissor "
                                    + nameInputPlayer2 : (rounds < 10 && rounds > 6) ?
                                    "I rock this game!" : (rounds > 10) ?
                                    "Buckle up!" : "Do you even know what you are doing?";
                    System.out.println(roundsStatment);
                    int[] arraysToKeepWinnerScore = new int[3];
                    int j = 0;
                    do {

                        System.out.println("____________________________________###" + (j + 1) + ". round" + "###______________________________________________");
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println(nameInputPLayer1 + ", please make a choice: press 1 for rock, 2 for paper and 3 for scissor.");
                        int inputPlayer1 = scanner1.nextInt();
                        String inputconvertPLayer1 = (inputPlayer1 == 1) ? "rock" : (inputPlayer1 == 2) ? "paper" : "scissor";
                        System.out.println(inputconvertPLayer1);
                        System.out.println(nameInputPlayer2 + ", please make a choice:");
                        String[] options2 = {"rock", "paper", "scissor"};
                        String inputPlayer2 = player2Output(inputDifficultyLevel);
                        System.out.println(inputPlayer2);
                        String whoWins = winnerStatment(inputPlayer1 - 1, inputPlayer2, nameInputPLayer1, nameInputPlayer2);
                        arraysToKeepWinnerScore[(inputForCounterArray(whoWins, nameInputPLayer1, nameInputPlayer2))]++;
                        Arrays.stream(arraysToKeepWinnerScore).count();

                        if (rounds - 1 > j) {
                            String winnerStatementRounds = (arraysToKeepWinnerScore[0] > arraysToKeepWinnerScore[1]) ? nameInputPLayer1 + " is winning the game" :
                                    (arraysToKeepWinnerScore[1] > arraysToKeepWinnerScore[0]) ? nameInputPlayer2 + " is winning the game" : "The game looks like a draw";
                            System.out.println("\n" + winnerStatementRounds);

                        }

                        if (rounds - 1 == j) {
                            if (arraysToKeepWinnerScore[0] > arraysToKeepWinnerScore[1]) {
                                System.out.println("\n\n" + "---------------------------------------------------");
                                System.out.println(nameInputPLayer1 + " is the winner");
                                System.out.println("---------------------------------------------------");
                            } else if (arraysToKeepWinnerScore[1] > arraysToKeepWinnerScore[0]) {
                                System.out.println("\n\n" + "---------------------------------------------------");
                                System.out.println(nameInputPlayer2 + " is the winner");
                                System.out.println("---------------------------------------------------");
                            } else {
                                System.out.println("\n\n" + "---------------------------------------------------");
                                System.out.println("The game is a draw");
                                System.out.println("---------------------------------------------------");
                            }


                        }


                        j++;
                    } while (j < rounds);

                    System.out.println(scanner.nextLine());
                    System.out.println("__________________________________________________");
                    System.out.println("__________________________________________________");


                }
            }
            if (inputAnswerGameMode.toUpperCase(Locale.ROOT).equals("X")) {


                System.out.println("Hello, and what's player 2's name?");
                String nameInputPlayer2 = scanner.nextLine();
                System.out.println("How many rounds would you like to play?");
                int roundsMultiplayer = scanner.nextInt();
                int[] arraysToKeepWinnerScoreMultiplayer = new int[3];
                int l = 0;
                do {
                    System.out.println(nameInputPLayer1 + ", please make a choice: press 1 for rock, 2 for paper and 3 for scissor.");
                    int inputPlayer1 = scanner.nextInt();
                    String inputtingPLayer1 = (inputPlayer1 == 1) ? "rock" : (inputPlayer1 == 2) ? "paper" : "scissor";
                    System.out.println(inputtingPLayer1);
                    System.out.println(nameInputPlayer2 + ", please make a choice: press 1 for rock, 2 for paper and 3 for scissor.");
                    int inputPlayer2 = scanner.nextInt();
                    String inputconvertPLayer2 = (inputPlayer2 == 1) ? "rock" : (inputPlayer2 == 2) ? "paper" : "scissor";
                    System.out.println(inputconvertPLayer2);
                    winnerStatment(inputPlayer1 - 1, inputToStringConverterPlayer1(inputPlayer2), nameInputPLayer1, nameInputPlayer2);
                    String whoWins = winnerStatment(inputPlayer1 - 1, inputToStringConverterPlayer1(inputPlayer2), nameInputPLayer1, nameInputPlayer2);
                    arraysToKeepWinnerScoreMultiplayer[(inputForCounterArray(whoWins, nameInputPLayer1, nameInputPlayer2))]++;
                    Arrays.stream(arraysToKeepWinnerScoreMultiplayer).count();

                    if (roundsMultiplayer - 1 > l) {
                        String winnerStatementRounds = (arraysToKeepWinnerScoreMultiplayer[0] > arraysToKeepWinnerScoreMultiplayer[1]) ? nameInputPLayer1 + " is winning the game" :
                                (arraysToKeepWinnerScoreMultiplayer[1] > arraysToKeepWinnerScoreMultiplayer[0]) ? nameInputPlayer2 + " is winning the game" : "The game looks like a draw";
                        System.out.println("\n" + winnerStatementRounds);

                    }

                    if (roundsMultiplayer - 1 == l) {
                        if (arraysToKeepWinnerScoreMultiplayer[0] > arraysToKeepWinnerScoreMultiplayer[1]) {
                            System.out.println("\n\n" + "---------------------------------------------------");
                            System.out.println(nameInputPLayer1 + " is the winner");
                            System.out.println("---------------------------------------------------");
                        } else if (arraysToKeepWinnerScoreMultiplayer[1] > arraysToKeepWinnerScoreMultiplayer[0]) {
                            System.out.println("\n\n" + "---------------------------------------------------");
                            System.out.println(nameInputPlayer2 + " is the winner");
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("\n\n" + "---------------------------------------------------");
                            System.out.println("The game is a draw");
                            System.out.println("---------------------------------------------------");
                        }


                    }
                    l++;
                } while (l < roundsMultiplayer);
                  System.out.println(scanner.nextLine());                                     
                  System.out.println("__________________________________________________");   
                  System.out.println("__________________________________________________");   
                i++;
            }
        } while (i < 30);
    }




    public static String nameGenerator() {
        Random random = new Random();
        String[] nameLetters = {"si", "mo", "n", "so", "fi", "e", "an", "na", "fe", "ri", "ki", "a"};
        String[] firstbameLetters = {"Ri", "Mo", "N", "So", "Fi", "E", "An", "Na", "Fe", "Ri", "Ki", "A"};
        String[] sirnames = {"Pedersen", "MacFly", "Gunderson", "Beckmann", "Karlsson", "Larsen", "Ling", "Hildursson", "West","Scott","Halpert","Freng","Zweistein"};
        int high = nameLetters.length;
        int low = 1;
        int result1 = random.nextInt(high - low) + low;
        int result2 = random.nextInt(high - low) + low;
        int result3 = random.nextInt(high - low) + low;
        int result4 = random.nextInt(high - low) + low;
        String randomNames = firstbameLetters[result1] + nameLetters[result2] + nameLetters[result3] + " " + sirnames[result4];
        return randomNames;
    }

    public static String player2Output(double difficulty) {
        String[] options = {"rock", "paper", "scissor","rock", "rock", "scissor","rock", "rock", "rock","paper",
                "paper", "paper","scissor","paper", "scissor"};
        Random random = new Random();
        double high = options.length;
        double low = options.length-Math.sqrt(Math.pow(difficulty+3,2));
        double result = random.nextInt((int) (high - low)) + low;
        return options[(int) result];

         
    }


      public static String  winnerStatment(int player1, String player2, String player1name, String player2name) {
             String[] options = {"rock", "paper", "scissor"};
             boolean player1EqualsScissor = player1 == 2;
             boolean player2EqualsScissor = player2.equals(options[2]);
             boolean player1EqualsPaper = player1 == 1;
             boolean player2EqualsPaper = player2.equals(options[1]);
             boolean player1EqualsRock = player1 == 0;
             boolean player2EqualsRock = player2.equals(options[0]);
             String winCheck = (player2EqualsRock && player1EqualsPaper)?player1name + " wins":
                     (player1EqualsRock && player2EqualsPaper)?player2name + " wins":
                       (player1EqualsScissor && player2EqualsPaper)?player1name + " wins":
                          (player2EqualsScissor && player1EqualsPaper)?player2name + " wins":
                             (player1EqualsRock && player2EqualsScissor)?player1name + " wins":
                                (player2EqualsRock && player1EqualsScissor)?player2name + " wins":"draw";
          return winCheck;
         }

         public static int inputForCounterArray (String winninglyInput,String player1name,String player2name){
             return (winninglyInput.equals("draw"))?2:(winninglyInput.equals(player2name + " wins"))?1:0;


         }
             
          public static String inputToStringConverterPlayer1(int inputPlayer1){
              return (inputPlayer1 == 1)?"rock":(inputPlayer1 == 2)?"paper":"scissor";
          }


}