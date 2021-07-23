//You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty.
// The rat can move from a position towards left, right, up or down on the grid.
//Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is
// waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.

//Input Format
//First line contains 2 integers N and M denoting the rows and columns in the grid.
// Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and
// ans 'O' denotes that the cell is empty.

//Output Format
//Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is
// covered in the path and a 0 denotes that the cell is not covered in the path.
//If a path does not exits then print "NO PATH FOUND"

package Codenation_Tasks.Recursion;
import java.util.*;
public class RatChaseChesse_ALL_FOUR_DIRECTION {
    static boolean hasPath;
    public static void printPath(int[][] maze, int cr, int cc, int er, int ec, boolean[][] vis) {
        if (cr == er && cc == ec) {
            hasPath = true;
            vis[cr][cc]=true;
            for(int i=0; i<=cr; i++){
                for(int j=0; j<=cc; j++){
                    if(vis[i][j]==true){
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
            return;
        }
        if (cr > er || cc > ec || cr < 0 || cc < 0 || vis[cr][cc] == true || maze[cr][cc] == 1) {
            return;
        }
        vis[cr][cc] = true;  // before entering marking true that we are doing this
        printPath(maze, cr - 1, cc, er, ec, vis);
        printPath(maze, cr + 1, cc, er, ec, vis);
        printPath(maze, cr, cc - 1, er, ec, vis);
        printPath(maze, cr, cc + 1, er, ec, vis);
        vis[cr][cc]=false; // backtracking.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] maze = new int[m][n];
        for(int i=0; i<m; i++){      // taking input of maze matrix
            String element = sc.next();
            for(int j=0; j<n; j++){
                if(element.charAt(j)=='O'){
                    maze[i][j] = 0;
                } else {
                    maze[i][j] = 1; // cant move on this
                }
            }
        }
        hasPath = false;
        printPath(maze, 0, 0, m-1, n-1, new boolean[m][n]);
        if(hasPath==false){
            System.out.println("NO PATH FOUND");
        }
    }
}
