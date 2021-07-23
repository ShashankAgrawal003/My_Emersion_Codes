//Take as input str, a string. We are concerned with all the possible ascii-subsequences of str.
// E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
//a. Write a recursive function which returns the count of ascii-subsequences for a given string.
// Print the value returned.
//b. Write a recursive function which prints all possible ascii-subsequences for a given string
// (void is the return type for function).

package Codenation_Tasks.Recursion;
import java.util.*;
public class ASCIISubsequence {
    public static int count=0;
    public static void fun(String inp,String ans,int curr){
        if (curr == inp.length()) { // curr reaches at last
            if (ans.length() >= 0) { // and " " "b" ye sab print krna ho
                count++;
                System.out.print(ans + " ");
            }
            return;
        }
        char cc=inp.charAt(curr);
        fun(inp,ans,curr+1); //ignore
        fun(inp,ans+cc,curr+1); //added
        fun(inp,ans+(int)cc,curr+1); //ASCI value

        return;
    }

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        fun(str,"",0);

        System.out.println();
        System.out.print(count);
    }
}
