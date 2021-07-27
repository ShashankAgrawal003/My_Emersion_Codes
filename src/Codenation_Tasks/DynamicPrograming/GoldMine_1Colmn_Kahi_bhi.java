//Given a gold mine (M) of n*m dimensions. Each field in this mine contains a positive integer which
// is the amount of gold in tons.
// Initially the miner is at first column but can be at any row.
// He can move only (right->,right up /,right down) that is from a given cell,
// the miner can move to the cell diagonally up towards the right or right or diagonally down
// towards the right. Your task is to find out maximum amount of gold which he can collect.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class GoldMine_1Colmn_Kahi_bhi {
    public static int fun(int[][] maze,int cr,int cc,int er,int ec,int dp[][]){
        if((cc<0) || (cr>er)|| (cc>ec)||(cr<0)) {return 0;}
        if((cc==ec) && (cr==er)){
            return maze[cr][cc];}
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int rightdown=0;
        int rightup=0;
        int right=0;
        right=fun(maze,cr,cc+1,er,ec,dp);
        rightdown=fun(maze,cr+1,cc+1,er,ec,dp);
        rightup=fun(maze,cr-1,cc+1,er,ec,dp);
        return dp[cr][cc]=maze[cr][cc]+Math.max(rightdown,Math.max(rightup,right));

    }
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int m=s.nextInt();
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=s.nextInt();
                }
            }
            int ans[]=new int[n];
            int dp[][]=new int[n+1][m+1];
            for(int[] i:dp){
                Arrays.fill(i,-1);
            }
            for(int i=0;i<n;i++){
                ans[i]=fun(arr,i,0,n-1,m-1,dp);
            }
            Arrays.sort(ans);
            System.out.println(ans[n-1]);
            t--;
        }
    }
}
