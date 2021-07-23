//Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all
// possible words that can be written with the pressed keys.
//Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno ,
// 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
//E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
//a. Write a recursive function which returns the count of words for a given keypad string.
// Print the value returned.
//b.Write a recursive function which prints all possible words for a given keypad string
// (void is the return type for function).
//Explanation
//1 can correspond to 'a' , 'b' or 'c' .
// 2 can correspond to 'd', 'e' or 'f'.
// We print all combinations of these

package Codenation_Tasks.Recursion;
import java.util.*;
public class KEYPAD_recursion {
    public static String[] mapping = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx","yz"};
    public static int count=0;
    private static void sol(String inp, String out) {
        // TODO Auto-generated method stub
        if(inp.length() == 0) {
            count++;
            System.out.print(out+" ");
            return;
        }
        char currentDigitChar = inp.charAt(0); // '2'
        int currDigInt = currentDigitChar - '0'; //2

        String mappedString = mapping[currDigInt]; //"abc"
        for(int i = 0; i < mappedString.length(); i++) {
            String bachiHuiString = inp.substring(1); //27 -> 7
            sol(bachiHuiString, out + mappedString.charAt(i));
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        count=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        sol(str,"");
        System.out.println();
        System.out.print(count);
    }
}
