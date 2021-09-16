import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
            String nameInputPlayer2 = nameGenerator2();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello and welcome to the game, my name is " + nameInputPlayer2 + "\nwhat's your name?");
            String nameInputPlayer1 = scanner.nextLine();
            System.out.println("ok, " + nameInputPlayer1 + " how many rounds would you like to play?");
            int rounds = scanner.nextInt();
            String roundsStatment = (rounds == 2)?"That's goind to be a quick one":(rounds < 6)?"They call me scissor " + nameInputPlayer2:(rounds < 10 && rounds > 6)?"I rock this game!":(rounds > 10)?"Buckle up!":"Do you even know what you are doing?";
            System.out.println(roundsStatment);
            int[] counterArray = new int[3];
            int i = 0;
            do {
                System.out.println("____________________________________###"+ (i+1) + ". round" + "###______________________________________________");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println(nameInputPlayer1 + ", please make a choice:");
                int inputPlayer1 = scanner1.nextInt();
                String inputconvertPLayer1 = (inputPlayer1 == 1) ? "rock" : (inputPlayer1 == 2) ? "paper" : "scissor";
                System.out.println(inputconvertPLayer1);
                System.out.println(nameInputPlayer2 + ", please make a choice:");
                String[] options2 = {"rock", "paper", "scissor"};
                String inputPlayer2 = randomoutput();

                    int theAnswer = (inputconvertPLayer1.equals(options2[0])) ? 0 :
                            (inputconvertPLayer1.equals(options2[1])) ? 1 : 2;
                    counterArray[theAnswer]++;



                    String whatIsbetterAttack = (counterArray[0] >= counterArray[1] && counterArray[0] > counterArray[2])?options2[1]:(counterArray[1] >= counterArray[0] && counterArray[1] >= counterArray[2])
                            ?options2[2]:(counterArray[2] > counterArray[1] && counterArray[2] >= counterArray[0])?options2[0]:randomoutput();

                            inputPlayer2 = whatIsbetterAttack;
                    rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2);

                System.out.println(whatIsbetterAttack);
                int[] winnerArray = new int[rounds];
                winnerArray[inputPlayer1-1]++;
                Arrays.stream(winnerArray).count();
                    if (i == rounds-1) {
                        boolean winnerCheck = rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2).equals(nameInputPlayer1 + " wins");
                        boolean winnerCheck2 = rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2).equals(nameInputPlayer2 + " wins");
                        boolean winnerCheck3 = rockPaperScissors(inputconvertPLayer1, inputPlayer2, nameInputPlayer1, nameInputPlayer2).equals("draw");
                        if (winnerCheck) {
                            winnerArray[(inputPlayer1)] = i;
                            System.out.println(nameInputPlayer1 + " wins");
                        } else if (winnerCheck2) {
                            int inputconvertPLayer2 = (inputPlayer2.equals("rock")) ? 1 : (inputPlayer2.equals("paper")) ? 2 : 3;
                            winnerArray[(inputconvertPLayer2)] = i;
                            System.out.println(nameInputPlayer2 + " wins");
                        } else if (winnerCheck3) {
                            System.out.println("It's a draw :(");
                        }
                    }i++;




                } while (i < rounds);
            }

    public static String rockPaperScissors(String player1, String player2, String player1name, String player2name) {
        String[] options = {"rock", "paper", "scissor"};
        String winCheck = (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[2])) ? player1name+" wins" :
                (player2.toLowerCase(Locale.ROOT).equals(options[0]) && player1.toLowerCase(Locale.ROOT).equals(options[2])) ? player2name + " wins" :
                        (player1.toLowerCase(Locale.ROOT).equals(options[2]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player1name+ " wins" :
                                (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[2]))?player2name+" wins" :
                                        (player1.toLowerCase(Locale.ROOT).equals(options[1]) && player2.toLowerCase(Locale.ROOT).equals(options[0]))?player1name+" wins" :
                                                (player1.toLowerCase(Locale.ROOT).equals(options[0]) && player2.toLowerCase(Locale.ROOT).equals(options[1]))?player2name+" wins" :"draw";


        return winCheck;
    }
    public static String nameGenerator2(){
        String[] nameLetters = {"si","mo","n","so","fi","e","an","na","fe","ri","ki","a"};
        String[] firstbameLetters = {"Ri","Mo","N","So","Fi","E","An","Na","Fe","Ri","Ki","A"};
        String[] sirnames = {"Pedersen","MacFly","Gunderson","Beckmann","Karlsson","Larsen","Ling","Hildursson","West"};
        Random random = new Random();
        int high = nameLetters.length;
        int low = 0;
        int result1= random.nextInt(high-low)+low;
        int result3 = random.nextInt(high-low)+low;
        int result4 = random.nextInt(high-low)+low;
        int high6 = sirnames.length;
        int low6 = 0;
        int result6 = random.nextInt(high6-low6)+low6;
        String randomNames = firstbameLetters[result1]+nameLetters[result3]+nameLetters[result4]+" "+ sirnames[result6];
        return randomNames;
    }
    public static String randomoutput(){
        String[] options = {"rock", "paper", "scissor"};
        Random random = new Random();
        int high = 3;
        int low = 0;
        int result = random.nextInt(high-low)+low;
        String outputplayer = options[result];
        return outputplayer;
    }



}
