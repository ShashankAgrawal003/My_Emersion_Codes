//Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular
// board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move
// the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).
//a. Write a recursive function which returns the count of different ways the player can travel across the board.
// Print the value returned.
//b. Write a recursive function which prints moves for all valid paths across the board (void is the return type
// for function).
// Input Format
//Enter the number of rows N1 and number of columns N2.
//Output Format
//
//Display the total number of paths and print all the possible paths in a space separated manner

package Codenation_Tasks.Recursion;
import java.util.*;
public class MazePath_Normal_DiagonalCondition {
    public static int count=0;
    public static void diagonalmaze(int cr,int cc,int er,int ec,String path ){
        if(cr > er || cc > ec) {
            return; //laat
        }
        if(cr == er && cc == ec) {  //base case
            count++;
            System.out.print(path +" ");
            return;
        }
        diagonalmaze(cr+1, cc, er, ec, path + 'V'); // down
        diagonalmaze(cr, cc+1, er, ec, path + 'H'); // horizontal
        diagonalmaze(cr+1,cc+1,er,ec,path+'D'); // no condition given ki diogonal pe ho tabhi can move
    }
    public static void main(String args[]) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        count=0;
        diagonalmaze(0,0,n-1,m-1,"");
        System.out.println();
        System.out.print(count);
    }
}
