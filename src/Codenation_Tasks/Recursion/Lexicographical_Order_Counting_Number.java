//Take as input N, a number. Write a recursive function which prints counting from 0 to N in
// lexicographical order. In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.
package Codenation_Tasks.Recursion;
import java.util.*;
public class Lexicographical_Order_Counting_Number {
    public static void lexicount(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.print(curr+" ");
        int calldigit=0;
        if(curr==0){
            calldigit=1;
        }
        while(calldigit<=9)
        {lexicount(n,curr*10+calldigit);
            calldigit++;
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        lexicount(n,0);
    }
}
