import java.util.Scanner;

/**
 * Created by michael_hopps on 11/6/17.
 */
public class Main {

    public static void main(String[] args) {
        String myString = "something";

        printVertical(myString);
        System.out.println(reverse(myString));
    }

    public static void printVertical(String str){
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i+1);
            System.out.println(letter);
        }
    }

    public static String reverse(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(str.length()-i-1, str.length()-i);
            rev += letter;
        }
        return rev;
    }

    public static int count(String word, String letter){
        //returns the number of times letter appears in word

        //Option 1: for loop, substrings is letter
        //Option 2: while loop!  indexOf.

        int count = 0;
        int i = word.indexOf(letter);
        while(i > -1){
            count++;
            i = word.indexOf(letter, i+1);
        }
        return count;


    }



}
