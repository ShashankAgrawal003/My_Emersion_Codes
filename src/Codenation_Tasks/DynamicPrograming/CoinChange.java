//Given a value N, if we want to make change for N cents, and we have infinite supply
// of each of S = { S1, S2, .. , Sm} valued coins, In how many ways can we make the change?
// The order of coins doesn’t matter.

package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class CoinChange {
    private static int sol(int[] coins, int curr, int n, int amount, int[][] dp) {
        if(amount == 0) { //amount left is 0.
            return 1;
        }

        if(curr == n) {  //no currency can be used
            return 0;
        }

        if(dp[curr][amount] != -1) {
            return dp[curr][amount];
        }

        int inc = 0, exc = 0;

        if(coins[curr] <= amount) {
            inc = sol(coins, curr, n, amount - coins[curr], dp);
        }

        exc = sol(coins, curr + 1, n, amount, dp);

        dp[curr][amount] = inc + exc;
        return inc + exc;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int amount=s.nextInt();
        int m=s.nextInt();
        int[] coins=new int[m];
        for(int i=0;i<m;i++){
            coins[i] =s.nextInt();
        }
        int[][] dp = new int[m + 1][amount + 1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = sol(coins, 0, m, amount, dp);
        System.out.println(ans);
    }
}
