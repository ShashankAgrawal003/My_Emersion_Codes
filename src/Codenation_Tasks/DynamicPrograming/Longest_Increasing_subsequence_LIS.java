//Find the length of the longest subsequence in a given array A of integers such that all
// elements of the subsequence are sorted in strictly ascending order.(LIS)

package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Longest_Increasing_subsequence_LIS {
    public static int fun(int arr[],int n,int curr,int pre,int[][] dp){
        if(curr==n) return 0;
        // base case
        if(dp[pre+1][curr]!=-1){ // as pre = -1 always return or check for dp[pre+1][curr]
            return dp[pre+1][curr];
        }

        int inc=0;
        int dec=0;
        if((pre==-1) || (arr[pre]<arr[curr])){ // put condition pre==-1 first so when it's true it will not check for arr[pre] that is index out of bounds
            inc= 1+fun(arr,n,curr+1,curr,dp);   // include pe curr=pre
        }

        dec=fun(arr,n,curr+1,pre,dp);
        return dp[pre+1][curr]=Math.max(inc,dec);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int dp[][]=new int[n+1][n+1]; // Take int type dp no need to take long
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(fun(arr,n,0,-1,dp));
    }
}
