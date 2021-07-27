//You've heard of 0-1 knapsack. Below is the problem statement for the same.
//Given weights and values of n items, put these items in a knapsack of capacity cap to get the maximum total value
// in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which
// represent values and weights associated with n items respectively. Also given an integer cap which represents
// knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is
// smaller than or equal to cap. You cannot break an item, either pick the complete item, or don’t pick it
// (0-1 property).
// There is a little twist for 0-N knapsack. You can pick an element more than once.
// Now you have to find maximum value multi subset of val[] such that sum of the weights of this subset is
// smaller than or equal to cap.Note: Maximum value subset means the sunset with maximum sum of all the values in subset.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;

public class Knapsack_0_N {
    private static int maxProfit(int[] size, int[] value, int S, int curr, int[][] dp) {
        if(S == 0 || curr == size.length) {
            return 0;
        }
        if(dp[curr][S] != -1) {
            return dp[curr][S];
        }
        int take = 0, donttake = 0;
        if(value[curr] <= S) {   // infinite times take so when taking curr increses not
            take = size[curr] + maxProfit(size, value, S - value[curr], curr, dp);
        }
        donttake = maxProfit(size,value,S, curr + 1, dp);
        return dp[curr][S] = Math.max(take, donttake);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        int S = s.nextInt();
        int[] size = new int[N];
        int[] value = new int[N];
        for(int i = 0; i < N; i++ ) {
            value[i] = s.nextInt();
        }
        for(int i = 0; i < N; i++ ) {
            size[i] = s.nextInt();
        }
        int[][] dp = new int[N + 1][S + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(maxProfit(size,value,S, 0, dp));
    }
}
