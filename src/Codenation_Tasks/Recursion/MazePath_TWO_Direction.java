//Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular
// board. Our player starts in top-left corner of the board and must reach bottom-right corner.
// In one move the player can move 1 step horizontally (right) or 1 step vertically (down).
//a. Write a recursive function which returns the count of different ways the player can travel across
// the board. Print the value returned.
//b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board.
// Print the value returned.
//e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive
// function which prints moves for all valid paths across the board (void is the return type for function).
package Codenation_Tasks.Recursion;
import  java.util.*;
public class MazePath_TWO_Direction {
    public static int count=0;
    public static void fun(int cr,int cc,int er,int ec,String path){
        if(cr>er || cc>ec){
            return;}
        if(cr==er && cc==ec){
            count++;
            System.out.print(path+" ");
            return;
        }
        fun(cr+1,cc,er,ec,path+"V");
        fun(cr,cc+1,er,ec,path+"H");
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        count=0;
        fun(0,0,n-1,m-1,"");
        System.out.println();
        System.out.print(count);
    }
}
