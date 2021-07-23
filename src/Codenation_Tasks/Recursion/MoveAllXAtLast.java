//Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
//E.g. for “abexexdexed” return “abeedeedxxx”.
//Print the value returned
package Codenation_Tasks.Recursion;
import java.util.*;
public class MoveAllXAtLast {
    public static String allxatlast(String str,String ans,int curr,int xcount){
        if(curr==str.length()){
            return ans;
        }
        char cc=str.charAt(curr);
        String f_ans = "";
        if(cc!='x'){
            f_ans = allxatlast(str,ans+cc,curr+1,xcount);}
        else{
            f_ans  = allxatlast(str,ans,curr+1,xcount+1);
        }
        if(cc == 'x'){
            f_ans += 'x';
        }
        return f_ans;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans=allxatlast(str,"",0,0);
        System.out.println(ans);
    }
}
