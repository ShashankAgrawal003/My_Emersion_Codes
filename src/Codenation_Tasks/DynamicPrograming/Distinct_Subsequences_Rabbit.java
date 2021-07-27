//Given two sequences A, B, count number of unique ways in sequence A, to form a subsequence that is
// identical to the sequence B.
//Subsequence : A subsequence of a string is a new string which is formed from the original string by
// deleting some (can be none) of the characters without disturbing the relative positions of the remaining
// characters. (ie, “ACE” is a subsequence of “ABCDE” while “AEC” is not).
//Sample Input
// 1
//rabbbit
//rabbit
//Sample Output
//3
//Explanation
//These are the possible removals of characters:
// => A = "ra_bbit"
//=> A = "rab_bit"
//=> A = "rabb_it"
package Codenation_Tasks.DynamicPrograming;
import java.util.*;
public class Distinct_Subsequences_Rabbit {
    public static long fun(String s, String t, int i, int j, long[][] dp) {
        if (j == t.length()) return 1; //+ve case
        if (i == s.length()) return 0;  //-ve case

        if (dp[i][j] != -1) return dp[i][j];
        long inc = 0;
        long exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = fun(s, t, i + 1, j + 1, dp);
        }
        exc = fun(s, t, i + 1, j, dp);
        return dp[i][j] = inc + exc;

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        for (int i = 0; i < test; i++) {
            String s = cin.nextLine();
            String t = cin.nextLine();
            long dp[][] = new long[s.length() + 1][t.length() + 1];
            for (long[] row : dp) {
                Arrays.fill(row, -1);
            }
            System.out.println(fun(s, t, 0, 0, dp));
        }
    }
}
