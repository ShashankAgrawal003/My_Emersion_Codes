//Take as input str, a number in form of a string. Write a recursive function to convert
// the number in string form to number in integer form. E.g. for “1234” return 1234.
// Print the value returned.
package Codenation_Tasks.Recursion;
import java.util.*;
public class StringToInteger {
    public static int fun(String str){
        if (str.length() == 1)
            return (str.charAt(0) - '0');
        double y = fun(str.substring(1));
        double x = str.charAt(0) - '0'; //'1'=49,'0'=48 hence '1'-'0'=49-48=1(int)
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)(x);

    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int ans=fun(str);
        System.out.println(ans);
    }
}
