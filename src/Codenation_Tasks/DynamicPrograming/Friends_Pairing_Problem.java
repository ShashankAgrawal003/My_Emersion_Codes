//Given n friends, each one can remain single or can be paired up with some other friend.
// Each friend can be paired only once. Find out the total number of ways in which friends can
// remain single or can be paired up.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Friends_Pairing_Problem {
    public static long fun(int n,long[] dp){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fun(n-1,dp)+((n-1)*fun(n-2,dp));
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            long[] dp=new long[n+1];
            Arrays.fill(dp,-1);
            System.out.println(fun(n,dp));
            t--;
        }

    }
}
