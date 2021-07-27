//Given N, count the number of ways to express N as sum of 1, 3 and 4.
//Explanation
//1+1+1+1
// 1+3
//3+1
//4              Ans=4 ways
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Count_Ways_To_N_as_sum_of1_3_4 {
    private static long sol(int n,long[] dp) {

        if(n==0||n==1||n==2){ return 1;}
        if(n==3){return 2;}
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=sol(n-1,dp)+sol(n-3,dp)+sol(n-4,dp);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] dp=new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(sol(n,dp));
    }

}
