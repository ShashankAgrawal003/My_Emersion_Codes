//Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.
//a. Write a recursive function which returns the count of subsequences for a given string.
// Print the value returned.
//b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences
// “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.
// given string (void is the return type for function).
//Note: Use cin for input for C++

package Codenation_Tasks.Recursion;
import java.util.*;
public class SubSequence {
    public static int count=0;
    public static void sol(String inp,String out){
        if(inp.length() == 0) {
            count++;
            System.out.print(out+" ");
            return;
        }


        char cc = inp.charAt(0);
        sol(inp.substring(1), out);  //ignore
        sol(inp.substring(1), out + cc); //take


    }
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();

        sol(str,"");
        System.out.println();
        System.out.print(count);
    }
}
