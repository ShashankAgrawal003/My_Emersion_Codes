//Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and
// ladders). Take as input M, a number. M is the number of faces of the dice.
//a. Write a recursive function which returns the count of different ways the board can be traveled
// using the dice. Print the value returned.
//b. Write a recursive function which prints dice-values for all valid paths across the board (void is the
// return type for function).
//Sample Input
//3
// 3
//Sample Output
//111 12 21 3
//4
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Boardpath_Count_Print_Snake_ladder {
    public static int count=0;
    public static void fun(int n,int m,String ans){
        if(n==0){
            System.out.print(ans+" ");
            count++;
        }
        if(n<0){ return;}
        for(int i=1;i<=m;i++){
            fun(n-i,m,ans+i);
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        count=0;
        int n=s.nextInt();
        int m=s.nextInt();
        fun(n,m,"");
        System.out.println();
        System.out.print(count);
    }
}
