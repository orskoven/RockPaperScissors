import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static String wincheckerConverter(String inputplayer1,int roundss){
        String[] options = {"rock", "paper", "scissor"};
        int[] counterArray = new int[3];
        int theAnswer = (inputplayer1.equals(options[0])) ? 0:
        (inputplayer1.equals(options[1])) ?1 : 2;
        counterArray[theAnswer]++;
        Arrays.stream(counterArray).count();
        System.out.println(Arrays.toString(counterArray));
        Random random = new Random();
       int high = 3;
       int low = 0;
       int result = random.nextInt(high-low)+low;
       String outputplayer = options[result];
       return outputplayer;
    }

        public static String rockPaperScissors(String player1, String player2, String player1name, String player2name,int roundsInt) {
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
        String[] sirnames = {"Pedersen","MacFly","Gunderson","Beckmann","Karlsson","Larsen","Ling"};
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String nameInputPlayer1 = scanner.nextLine();
        System.out.println("Hello, and what's your name?");
        String nameInputPlayer2 = nameGenerator2();
        System.out.println(nameInputPlayer2);
        System.out.println("How many rounds would you like to play?");
        int rounds = scanner.nextInt();
        System.out.println();
        int[] counterArray = new int[3];
        int i = 0;
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println(nameInputPlayer1 + ", please make a choice:");
            String inputPlayer1 = scanner1.nextLine();
            System.out.println(nameInputPlayer2 + ", please make a choice:");
            String inputPlayer2 = wincheckerConverter(inputPlayer1,rounds);
            System.out.println(inputPlayer2);
            rockPaperScissors(inputPlayer1, inputPlayer2,nameInputPlayer1,nameInputPlayer2,rounds);
            String[] options = {"rock", "paper", "scissor"};
            int theAnswer = (inputPlayer1.equals(options[0])) ? 0:
                    (inputPlayer1.equals(options[1])) ?1 : 2;
            counterArray[theAnswer]++;
            Arrays.stream(counterArray).count();
            System.out.println(Arrays.toString(counterArray));
            i++;
        } while (i < rounds);
    }
    }

