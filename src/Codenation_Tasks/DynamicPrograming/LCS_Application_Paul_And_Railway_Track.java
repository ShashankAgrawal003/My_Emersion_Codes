//There are two horizontal rails X and Y. On railway line X, N numbers are written and on railway
// line Y, M numbers are written
//Paul works as engineer in railway department. Paul was tasked to join these two rails to with sleepers
// to complete the railway track.
//But there is a condition to join the rails with sleepers. The sleepers will be put on the position i and j
// such that -
//The number written on X at ith position i.e X[i] should be equal to the number written on Y at jth position
// i.e Y[j].
//The sleepers should not intersect or cross each other at all.
//Sleepers cannot intersect or cross each other at the ends .
//Return the maximum number of sleepers that Paul has to connect to complete the railway track.

package Codenation_Tasks.DynamicPrograming;
import java.util.*;                                                     // cross na ho lines
public class LCS_Application_Paul_And_Railway_Track {
    public static int fun(int[] arr1,int[] arr2,int n,int m,int[][] dp){
        if(n==0 ||m==0){return 0;}
        if(dp[n][m] != -1) {
            return dp[n][m];
        }
        if(arr1[n-1]==arr2[m-1]){
            return dp[n][m] =1+fun(arr1,arr2,n-1,m-1,dp);
        }
        else{
            int a=fun(arr1,arr2,n,m-1,dp);
            int b=fun(arr1,arr2,n-1,m,dp);
            return dp[n][m] =Math.max(a,b);
        }

    }
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(fun(arr1,arr2,n,m,dp));

    }
}
