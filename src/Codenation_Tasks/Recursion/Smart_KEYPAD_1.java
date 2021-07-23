//You will be given a numeric string S. Print all the possible codes for S.
//Following vector contains the codes corresponding to the digits mapped.
//string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
//For example, string corresponding to 0 is " " and 1 is ".+@$".
//Sample Input 12
//Sample Output
//.a
//.b
//.c
//+a
//+b
//+c
//@a
//@b
//@c
//$a
//$b
//$c
package Codenation_Tasks.Recursion;
import java.util.*;

public class Smart_KEYPAD_1 {
    public static String[] mapping =  {" ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void sol(String inp, String out) {
        // TODO Auto-generated method stub
        if(inp.length() == 0) {
            System.out.println(out);
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

        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        sol(str,"");
    }
}
