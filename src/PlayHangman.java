import java.util.Scanner;

public class PlayHangman {
    public static void StarGame() {
        //Starting message
        System.out.println("Play HangMan");
        System.out.println("________________________________________________");
        //scan the input from the user.
        Scanner scanner =new Scanner(System.in);
        boolean unfinished = true;
        int lives = 8;

        String targetWord = HangmanUtils.getRandomWord();
        System.out.println(targetWord);
        String dashWord = HangmanUtils.wordToDashes(targetWord);
        while (unfinished){
            System.out.println(dashWord);
            String guess = scanner.nextLine();
            System.out.println("Lives left: " + lives);
            System.out.println( "Checking if your guess is in the word");
            boolean isInWord = HangmanUtils.isGuessCharacterInWord(guess, targetWord);
            if(isInWord){
                String newDashWord = HangmanUtils.getIndexOfCorrectGuess(guess, targetWord, dashWord);
                dashWord = newDashWord;

            } else {
                System.out.println("Sorry! Bad guess!");
            }
            if(Character.isDigit(guess.charAt(0))){
                System.err.println("Not a letter \n Please try again");
                continue;
            }
            if(!isInWord){
//                System.out.println("HERE");
                lives--;
                HangmanDrowig.drawing(lives);
            }
            if(dashWord.equals(targetWord)){
                System.out.println("You have found the word! Congratulations!!");
            }

            if(lives <= 0 ){
                System.out.println("The Word was: " + targetWord + "\nYou have no more lives left. Better Luck next time.");
                return;
            }
        }
    }
}
