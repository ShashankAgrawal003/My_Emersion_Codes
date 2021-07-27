//A subsequence is a sequence that can be derived from another sequence by deleting some elements without
// changing the order of the remaining elements. For example, the sequence {A,B,D} is a subsequence of
// {A,B,C,D,E,F}, obtained after removal of elements C, E and F.
//Given two strings A and B of size n and m respectively, you have to find the length of
// Longest Common Subsequence(LCS) of strings A and B, where LCS is the longest sequence present in both
// A and B.
//Sample Input
//abc
// acd
//Sample Output
//2
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class LCS_length {
    public static int lCS(String s1, String s2, int n, int m, int[][] dp) {
        if(n == 0 || m == 0) {
            return 0; }
        if(dp[n][m] != -1) {
            return dp[n][m]; }
        if(s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = 1 + lCS(s1, s2, n - 1, m - 1, dp);
        } else {
            int c1 = lCS(s1, s2, n, m - 1, dp);
            int c2 = lCS(s1, s2, n - 1, m, dp);
            return dp[n][m] = Math.max(c1, c2);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(lCS(s1, s2, s1.length(), s2.length(), dp));
    }
}
