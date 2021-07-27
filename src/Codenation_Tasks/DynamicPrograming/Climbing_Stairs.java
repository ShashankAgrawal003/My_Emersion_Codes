//Reaching to the top of a staircase, it takes n steps.
//The task can be accomplished either by climbing 1 step or 2 steps at a time.
//In how many different ways can you climb to the top.
//Note: n will be a positive integer.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Climbing_Stairs {
    public static int fun(int curr,int n){
        if(curr==n){return 1;}
        if(curr>n){return 0;}
        int a1=fun(curr+1,n);
        int a2=fun(curr+2,n);
        return a1+a2;
    }
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(fun(0,n));
    }
}
