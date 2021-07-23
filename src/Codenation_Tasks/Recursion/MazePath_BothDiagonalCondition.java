//Take as input N. N is the number of rows and columns on a square board. Our player starts in top-left
// corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally
// (right) or 1 step vertically (down) or 1 step diagonally (south-east). But the diagonal step is allowed only
// when the player is currently on one of the diagonals (there are two diagonals)
//a. Write a recursive function which returns the count of different ways the player can travel across the board.
// Print the value returned.
//b. Write a recursive function which prints moves for all valid paths across the board (void is the return type
// for function).
// Input Format
//Enter the number N.

//Sample Input 3
//Sample Output
//VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD
//11
package Codenation_Tasks.Recursion;
import java.util.*;
public class MazePath_BothDiagonalCondition {
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
        if((((cr+cc)==er))|| (cr==cc)){
            diagonalmaze(cr+1,cc+1,er,ec,path+'D'); // left diagonal written on south east
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        count=0;
        diagonalmaze(0,0,n-1,n-1,"");
        System.out.println();
        System.out.print(count);
    }
}
