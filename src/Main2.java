import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static String randomoutput(){
        String[] options = {"rock", "paper", "scissor"};
        Random random = new Random();
       int high = 3;
       int low = 0;
       int result = random.nextInt(high-low)+low;
       String outputplayer = options[result];
       return outputplayer;
    }

        public static String rockPaperScissors(String player1, String player2, String player1name, String player2name) {
            String[] options = {"rock", "paper", "scissor"};
            String winCheck = (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[2])) ? player1name+" wins" :
                    (player2.toLowerCase(Locale.ROOT).equals(options[0]) && player1.toLowerCase(Locale.ROOT).equals(options[2])) ? player2name + " wins" :
                            (player1.toLowerCase(Locale.ROOT).equals(options[2]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player1name+ " wins" :
                                    (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[2]))?player2name+" wins" :
                                            (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[0]))?player1name+" wins" :
                                                    (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player2name+" wins" :"draw";


          //  System.out.println(winCheck);
            return winCheck;
        }

        public static int getTheTotalWins(String winning, String player1, String player2){
        int[] winnerArray = new int[3];
        int winningCheck = (winning.equals(player1.toLowerCase() + " wins"))?winnerArray[0]:(winning.equals(player1.toLowerCase() + " wins"))?winnerArray[1]:winnerArray[2];
        //String theWinnerIs = (winnerArray[0])?player1 + " is the winner!":(winningCheck == 1)?player2 + " is the winner!":
             //   "It's a draw";

        return winningCheck;
        }



        public static String nameGenerator(){
            Random random = new Random();
            int high = 4;
            int low = 0;
            int result = random.nextInt(high-low)+low;
            String[] nameLetters = {"albert","frankenstein", "morgan freeman","will smith"};
            String randomNames = nameLetters[result];
            return randomNames;
        }

    public static String nameGenerator2(){
        String[] nameLetters = {"si","mo","n","so","fi","e","an","na","fe","ri","ki","a"};
        String[] firstbameLetters = {"Ri","Mo","N","So","Fi","E","An","Na","Fe","Ri","Ki","A"};
        String[] sirnames = {"Pedersen","MacFly","Gunderson","Beckmann","Karlsson","Larsen","Ling","Hildursson","West"};
        Random random = new Random();
        int high = nameLetters.length;
        int low = 0;
        int result = random.nextInt(high-low)+low;
        int result1= random.nextInt(high-low)+low;
        int result2 = random.nextInt(high-low)+low;
        int result3 = random.nextInt(high-low)+low;
        int result4 = random.nextInt(high-low)+low;
        int result5 = random.nextInt(high-low)+low;
        int high6 = sirnames.length;
        int low6 = 0;
        int result6 = random.nextInt(high6-low6)+low6;
        String randomNames = firstbameLetters[result1]+nameLetters[result3]+nameLetters[result4]+" "+ sirnames[result6];
        return randomNames;
    }


    public static void main(String[] args) {
        int j = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello, what's your name?");
            String nameInputPlayer1 = scanner.nextLine();
            System.out.println("Hello, and what's your name?");
            String nameInputPlayer2 = nameGenerator2();
            System.out.println(nameInputPlayer2);
            System.out.println("How many rounds would you like to play?");
            int rounds = scanner.nextInt();


            //String inputPlayer2 = randomoutput();
            int[] counterArray = new int[3];
            int i = 0;
            do {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println(nameInputPlayer1 + ", please make a choice:");
                int inputPlayer1 = scanner1.nextInt();
                String inputconvertPLayer1 = (inputPlayer1 == 1) ? "rock" : (inputPlayer1 == 2) ? "paper" : "scissor";
                System.out.println(inputconvertPLayer1);
                System.out.println(nameInputPlayer2 + ", please make a choice:");
                String[] options2 = {"rock", "paper", "scissor"};
                String inputPlayer2 = randomoutput();
                // rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2);


                /*
                if (counterArray[0] > counterArray[1] && counterArray[0] > counterArray[2]) {
                    inputPlayer2 = options2[1];
                    if (counterArray[2] > counterArray[1]) {
                        inputPlayer2 = options2[0];
                    }

                } else if (counterArray[1] > counterArray[0] && counterArray[1] > counterArray[2]) {
                    inputPlayer2 = options2[2];
                    if (counterArray[0] > counterArray[2]) {
                        inputPlayer2 = options2[1];
                    }

                } else if (counterArray[2] > counterArray[1] && counterArray[2] > counterArray[0]) {
                    inputPlayer2 = options2[0];
                    if (counterArray[1] > counterArray[0]) {
                        inputPlayer2 = options2[2];
                    }
                }

                 */
                i++;
                j++;
                do {

                    int theAnswer = (inputconvertPLayer1.equals(options2[0])) ? 0 :
                            (inputconvertPLayer1.equals(options2[1])) ? 1 : 2;
                    counterArray[theAnswer]++;
                    Arrays.stream(counterArray).count();
                    System.out.println(inputPlayer2);
                    rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2);
                    if (counterArray[0] > counterArray[1] && counterArray[0] > counterArray[2]) {
                        inputPlayer2 = options2[1];
                        //if (counterArray[1] > counterArray[0] && counterArray[1] > counterArray[2]) {
                          //  inputPlayer2 = options2[0];
                       // }

                    } else if (counterArray[1] >= counterArray[0] && counterArray[1] >= counterArray[2]) {
                        inputPlayer2 = options2[2];
                        //if (counterArray[0] > counterArray[2] && counterArray[0] > counterArray[1]) {
                          //  inputPlayer2 = options2[1];
                        //}

                    } else if (counterArray[0] >= counterArray[1] && counterArray[0] >= counterArray[2]) {
                        inputPlayer2 = options2[1];
                        //if (counterArray[2] > counterArray[0] && counterArray[2] > counterArray[1]) {
                         //   inputPlayer2 = options2[0];
                        //}
                    } else {

                        //rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2);
                        int[] scoreArray = new int[2];
                        scoreArray[getTheTotalWins(rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2)
                                , nameInputPlayer1, nameInputPlayer2)] = i++;
                        Arrays.stream(scoreArray).count();
                        // if (i > rounds) {
                        //   System.out.println(Arrays.stream(scoreArray).count());
                        //}
                        if (i == rounds) {
                            System.out.println(scoreArray[getTheTotalWins(rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2)
                                    , nameInputPlayer1, nameInputPlayer2)]);

                            System.out.println(counterArray);
                        }
                    }
                 }    while (j > i) ;



            } while (i < rounds);

            System.out.println();
            System.out.println("__________________________________________________________________________________");
            System.out.println("___________________________________________\n______________________________________");

            } while (j < 100);

    }
}

