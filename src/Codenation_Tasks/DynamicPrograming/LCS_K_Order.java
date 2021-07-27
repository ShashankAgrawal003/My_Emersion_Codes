//In addition to the two sequences, an additional parameter k was introduced.
// A k-ordered LCS is defined to be the LCS of two sequences if you are allowed to change atmost
// k elements in the first sequence to any value you wish to.
//Sample Input
//5 5 1      //k=1 n=5 m=5
// 1 2 3 4 5
//5 3 1 4 2
//Sample Output      // case 3 tabhi jaab k>=1 ho
//3
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class LCS_K_Order {
    public static int lCS(int[] arr1, int[] arr2,int n,int m,int k,int[][][] dp) {
        if(n < 0 || m < 0) {
            return 0;
        }
        if(dp[n][m][k] != -1) {
            return dp[n][m][k];
        }
        if((arr1[n] == arr2[m])){
            return dp[n][m][k] = 1 + lCS(arr1, arr2,n - 1, m - 1,k, dp);
        } else {
            int c1 = lCS(arr1, arr2,n - 1,m,k,dp);
            int c2 = lCS(arr1, arr2,n,m-1,k,dp);
            int c3=0;
            if(k>=1){
                c3=1+lCS(arr1,arr2,n-1,m - 1,k-1, dp);
            }
            return dp[n][m][k] = Math.max(c1,Math.max(c2,c3));
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int m = s.nextInt();
        int k=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++) {
            arr1[i]=s.nextInt();}
        for(int i=0;i<m;i++) {
            arr2[i]=s.nextInt();}
        int[][][] dp = new int[n+1][m+1][k+1];
        for(int[][] row : dp) {
            for (int[] column : row)
            {
                Arrays.fill(column, -1);
            }

        }
        System.out.println(lCS(arr1,arr2,n-1,m-1,k,dp));
    }
}
