//Josh is stuck in a m*n grid. He has to travel from top left to bottom right.For every cell to pass,
// there is a specific amount of money josh has to pay. Your task is to find out minimum amount of money
// josh has to pay to reach bottom right.
//Sample Input
//3 3
// 1 3 1
//1 5 1
//4 2 1
//Sample Output
//7
//Explanation
//Josh will take 1→3→1→1→1 path to minimize the amount he has to pay
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Minimum_Path_Sum {
    private static int minCost(int[][] grid, int cr, int cc, int er, int ec,int[][] dp) {
        if(cr > er || cc > ec) { return Integer.MAX_VALUE;} // infinity assigned
        if(dp[cr][cc]!=-1){ return dp[cr][cc]; }
        if(cr == er && cc == ec) { return dp[cr][cc]=grid[cr][cc]; }
        int right = minCost(grid, cr, cc + 1, er, ec,dp);
        int down = minCost(grid, cr + 1, cc, er, ec,dp);
        int myAns = Math.min(right, down) + grid[cr][cc];
        return dp[cr][cc]=myAns;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=s.nextInt();
            }
        }
        int[][] dp=new int[n][m];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(minCost(grid, 0, 0, grid.length - 1, grid[0].length - 1,dp));
    }

}
