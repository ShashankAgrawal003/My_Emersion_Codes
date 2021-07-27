//Given 3 strings ,the task is to find the longest common sub-sequence in all three given sequences.
package Codenation_Tasks.DynamicPrograming;
import java.util.*;

public class LCS_With_3_String {
    public static int lCS(String s1, String s2,String s3, int n, int m,int l,int[][][] dp) {
        if(n == 0 || m == 0 || l==0) {
            return 0;
        }
        if(dp[n][m][l] != -1) {
            return dp[n][m][l];
        }
        if((s1.charAt(n - 1) == s2.charAt(m - 1))&&(s1.charAt(n - 1) == s3.charAt(l - 1))){
            return dp[n][m][l] = 1 + lCS(s1, s2,s3, n - 1, m - 1,l-1, dp);
        } else {
            int c1 = lCS(s1, s2,s3, n, m,l-1, dp);
            int c2 = lCS(s1, s2,s3, n, m - 1,l, dp);
            int c3 = lCS(s1, s2,s3, n - 1, m,l, dp);
            return dp[n][m][l] = Math.max(Math.max(c1,c2),c3);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3= s.nextLine();
        int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length()+1];
        for(int[][] row : dp) {
            for (int[] column : row)
            {
                Arrays.fill(column, -1);
            }
        }
        System.out.println(lCS(s1, s2,s3,s1.length(), s2.length(),s3.length(), dp));
    }
}
