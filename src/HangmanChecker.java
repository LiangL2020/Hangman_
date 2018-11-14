import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by liang_lu on 11/6/17.
 */
public class HangmanChecker {

    private String secretWord; //"word"
    private String display; //"****"
    private int guessesLeft;

    public HangmanChecker(String secretWord){
        guessesLeft = secretWord.length() + 3;

        this.secretWord = secretWord;
        display = "";
        for (int i = 0; i < secretWord.length(); i++) {
            display += "*";
        }
        printStatus();
        System.out.println("");
    }

    public void checkGuess(String guess){
        //guess to capital letter
        guess = guess.toUpperCase();
        if(secretWord.contains(guess)){
            replaceAll(guess);
            printStatus();
            System.out.print("You are correct! " + guess + " is a letter in the word!");
            System.out.println("");
            System.out.println("");
        }else{
            guessesLeft--;
            printStatus();
            System.out.print("That is not correct! " + guess + " is not ewa letter in the word!");
            System.out.println("");
            System.out.println("");
        }
    }

    public void replaceAll(String guess){
        for (int i = 0; i < secretWord.length(); i++) {
            if(secretWord.substring(i, i+1).contains(guess)){
                String newDisplay = display.substring(0, i) + guess + display.substring(i+1);
                display = newDisplay;
            }
        }
    }


    public void printStatus(){
        System.out.println(display);
        System.out.println("Guesses Left: " + guessesLeft);
    }

    public int getGuessesLeft(){
        return guessesLeft;
    }

    public boolean didWin(){
        if(display.equalsIgnoreCase(secretWord)) {
//            System.out.println(display);
            return true;
        }else{
//            System.out.println(display);
            return false;} //dummy return so it compiles.  Fix this.
    }

}
//guess.equals(secretWord.substring(i))