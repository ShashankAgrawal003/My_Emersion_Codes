//You are provided an integers N. You need to count all possible distinct binary strings of
// length N such that there are no consecutive 1’s.
package Codenation_Tasks.DynamicPrograming;
import  java.util.*;
public class Count_Binary_Strings_NO_1_TOGETHER {
    public static long fun(int n,long[] dp){
        if(n==0){ return 0;}
        if(n==1){return 2;}
        if(n==2){ return 3;}
        if(dp[n]!=-1){ return dp[n];}
        else{
            return dp[n]=fun(n-2,dp)+fun(n-1,dp);
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            long dp[]=new long[n+1];
            for(int i=0;i<n+1;i++){
                dp[i]=-1;
            }
            System.out.println(fun(n,dp)); //fibo (n) ki series
            t--;
        }
    }
}
