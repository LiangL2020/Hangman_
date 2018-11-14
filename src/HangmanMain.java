import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import sun.font.TrueTypeFont;

import java.util.Scanner;

/**
 * Created by liang_lu on 11/6/17.
 */
public class HangmanMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arr[] = {"WORD", "SCIENCE", "SISTER", "SCHOOL", "COMPUTER"};
        char again = 'y';


        while(again == 'y' || again == 'Y'){
            int x = (int)(Math.random() * (arr.length));
            HangmanChecker word = new HangmanChecker(arr[x]);
            boolean b = true;
            while(!word.didWin() && word.getGuessesLeft() > 0){
                System.out.print("Enter a char: ");
                char a = input.next().charAt(0);
                String s = "" + a;
                word.checkGuess(s);
//            System.out.println(word.getGuessesLeft());
            }

            if(word.didWin()){
                System.out.println("You win!");
            }else{
                System.out.println("You lose!");
            }
            System.out.print("Do you want play again? y or n: ");
            again = input.next().charAt(0);

        }

//        word.checkGuess("L");
//        word.checkGuess("O");
//        word.checkGuess("D");
//        word.checkGuess("R");
//        word.checkGuess("W");



    }
}
