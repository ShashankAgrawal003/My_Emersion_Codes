//Take as input str, a string. Write a recursive function which returns a new string in which all
// duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”.
// Print the value returned
package Codenation_Tasks.Recursion;
import java.util.*;
public class DuplicateCharReformating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s,0,""));
    }

    public static String solve(String s,int i,String ans){
        if(i == s.length()){
            return ans;
        }

        if(i == 0){
            return solve(s,i + 1,ans + s.charAt(i)); // agar at 0 index then toh direct add
        }

        if(s.charAt(i - 1) == s.charAt(i)){
            return solve(s,i + 1, ans + "*" + s.charAt(i));
        }
        return solve(s,i + 1,ans + s.charAt(i));
    }
}
