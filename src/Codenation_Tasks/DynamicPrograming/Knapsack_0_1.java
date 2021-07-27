//You are packing for a vacation on the sea side and you are going to carry only one bag with
// capacity S (1 <= S <= 1000). You also have N (1<= N <= 1000) items that you might want to take
// with you to the sea side. Unfortunately you can not fit all of them in the knapsack so you will
// have to choose. For each item you are given its size and its value. You want to maximize the total
// value of all the items you are going to bring. What is this maximum total value?
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Knapsack_0_1 {
    private static int maxProfit(int[] size, int[] value, int S, int curr, int[][] dp) {
        if(S == 0 || curr == size.length) {
            return 0;
        }
        if(dp[curr][S] != -1) {
            return dp[curr][S];
        }
        int take = 0, donttake = 0;
        if(value[curr] <= S) {
            take = size[curr] + maxProfit(size, value, S - value[curr], curr + 1, dp);
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
            value[i] = s.nextInt(); }
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
