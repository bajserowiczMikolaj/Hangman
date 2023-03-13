public class HangmanDrowig {
    //Printing out the hangman drawing.
    public static void drawing(int lives){
        if(lives == 8){
            System.out.println("");
        } else if(lives == 7) {
            System.out.println("-------------");
        } else if (lives == 6) {
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 5) {
            System.out.println("      |----------");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 4) {
            System.out.println("      |----------");
            System.out.println("      |         |");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 3) {
            System.out.println("      |----------");
            System.out.println("      |         |");
            System.out.println("      |        ( )");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 2) {
            System.out.println("      |----------");
            System.out.println("      |         |");
            System.out.println("      |        ( )");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 1) {
            System.out.println("      |----------");
            System.out.println("      |         |");
            System.out.println("      |        ( )");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("      |        /|");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        } else if (lives == 0) {
            System.out.println("      |----------");
            System.out.println("      |         |");
            System.out.println("      |        ( )");
            System.out.println("      |        /|");
            System.out.println("      |         |");
            System.out.println("      |        /|");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("      |      ");
            System.out.println("-------------");
        }
    }
}
