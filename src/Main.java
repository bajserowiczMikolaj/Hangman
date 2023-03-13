import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        PlayHangman.StarGame();
    }
}

















//        String word = "test";
//        Scanner scaner = new Scanner(System.in);
//
//
//
//        char[] userLetters = new char[word.length()];
//        for(int i = 0; i < word.length(); i++){
//            userLetters[i] = '_';
//        }
//
//        int playerLifes = 9;
//        boolean isRunning = true;
//        while (isRunning){
//
//            String userChoice = scaner.nextLine();
//            // sprawdź poprawność
//            char letter = userChoice.charAt(0);
//
//            //sprawdza czy odjąć życie..
//            boolean containsLetter = false;
//
//            //
//            for(int i = 0; i < word.length(); i++ ){
//                if(letter == word.charAt(i)){
//                    userLetters[i] = letter;
//                    containsLetter = true;
//                }
//            }
//            if(containsLetter == false){
//                playerLifes--;
//                System.out.println("Pozostało Ci " + playerLifes + " żyć!");
//            }
//            if(playerLifes == 0){
//                isRunning = false;
//                System.out.println("Nie masz więcej żyć!");
//            }
//
//        }
//
//
//    }
//}
//



//        public static void hangmanImage() {
//        }
//            if (count == 1) {
//                System.out.println("Wrong guess, try again");
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                System.out.println();
//                System.out.println("___|___");
//                System.out.println();
//            }
//            if (count == 2) {
//                System.out.println("Wrong guess, try again");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("___|___");
//            }
//            if (count == 3) {
//                System.out.println("Wrong guess, try again");
//                System.out.println("   ____________");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   | ");
//                System.out.println("___|___");
//            }
//            if (count == 4) {
//                System.out.println("Wrong guess, try again");
//                System.out.println("   ____________");
//                System.out.println("   |          _|_");
//                System.out.println("   |         /   \\");
//                System.out.println("   |        |     |");
//                System.out.println("   |         \\_ _/");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("   |");
//                System.out.println("___|___");
//            }
//            if (count == 5) {
//                System.out.println("Wrong guess, try again");
//                System.out.println("   ____________");
//                System.out.println("   |          _|_");
//                System.out.println("   |         /   \\");
//                System.out.println("   |        |     |");
//                System.out.println("   |         \\_ _/");
//                System.out.println("   |           |");
//                System.out.println("   |           |");
//                System.out.println("   |");
//                System.out.println("___|___");
//            }
//            if (count == 6) {
//                System.out.println("Wrong guess, try again");
//                System.out.println("   ____________");
//                System.out.println("   |          _|_");
//                System.out.println("   |         /   \\");
//                System.out.println("   |        |     |");
//                System.out.println("   |         \\_ _/");
//                System.out.println("   |           |");
//                System.out.println("   |           |");
//                System.out.println("   |          / \\ ");
//                System.out.println("___|___      /   \\");
//            }
//            if (count == 7) {
//                System.out.println("GAME OVER!");
//                System.out.println("   ____________");
//                System.out.println("   |          _|_");
//                System.out.println("   |         /   \\");
//                System.out.println("   |        |     |");
//                System.out.println("   |         \\_ _/");
//                System.out.println("   |          _|_");
//                System.out.println("   |         / | \\");
//                System.out.println("   |          / \\ ");
//                System.out.println("___|___      /   \\");
//                System.out.println("GAME OVER! The word was " + word);
//            }

