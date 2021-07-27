//A professional robber planning to rob houses along a street. Each house has a certain amount of
// money stashed, the only constraint stopping him from robbing each of them is that adjacent houses
// have security system connected and it will automatically contact the police if two adjacent houses
// were broken into on the same night.
//Given a list of non-negative integers representing the amount of money of each house, determine the
// maximum amount of money he can rob tonight without alerting the police.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Smart_Robber_House_Rubber {
    private static int sol(int[] houses, int curr, int n, int[] dp) {
        if(curr >= n) {
            return 0;
        }
        if(dp[curr] != -1) {
            return dp[curr];
        }
        int rob = houses[curr] + sol(houses, curr + 2, n, dp);
        int dontRob = sol(houses, curr + 1, n, dp);
        return dp[curr] = Math.max(rob, dontRob);
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        while(t>0){
            int n=s.nextInt();
            int[] house=new int[n];
            for(int i=0;i<n;i++){
                house[i]=s.nextInt();
            }
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            System.out.println(sol(house, 0, n, dp));
            t--;
        }
    }
}
