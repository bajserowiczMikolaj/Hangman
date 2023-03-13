import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class HangmanUtils {

    private static ArrayList<String> listOfWords = new ArrayList<>();


    static {
        listOfWords.add("telephon");
        listOfWords.add("elephant");
        listOfWords.add("");
    }
//get rando world
    public static String getRandomWord(){
        Random random = new Random();
        return listOfWords.get(random.nextInt(listOfWords.size()));
    }

    public static boolean isGuessCharacterInWord(String guessLetter, String targetWord){
        boolean guess;
        if(targetWord.contains(guessLetter)){
            return guess = true;
        } else {
            return false;
        }

    }

    public static String getIndexOfCorrectGuess(String guessLetter, String targetWord, String dashWord){
        if(Objects.equals(guessLetter, "")){
            return dashWord;
        } else {
            char guessChar = guessLetter.charAt(0);


            for (int i = 0; i < targetWord.length(); i++) {
                if (targetWord.charAt(i) == guessChar){
                    dashWord = dashWord.substring(0, i) + guessChar
                            + dashWord.substring(i + 1);
                }
            }
        }
        return dashWord;
    }

    public static String wordToDashes(String targetWord){
        char [] characters = new char[targetWord.length()];
        for (int i = 0; i < targetWord.length(); i++) {
            characters[i] = '-';
        }
        return String.valueOf(characters);
    }
}
