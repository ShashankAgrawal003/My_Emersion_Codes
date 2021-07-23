//Take as input str, a string. Write a recursive function which prints all the words possible
// by rearranging the characters of this string which are in dictionary order larger than the given string.
//The output strings must be lexicographically sorted.
//Explanation:-
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" .
// Only one of them is lexicographically greater than "cab". We only print "cba".
package Codenation_Tasks.Recursion;
import java.util.*;
public class Dict_Order_Larger {
    public static void lexiSort(String str1,String str2,String ans){

        if(str2.length()==0){
            if(ans.compareTo(str1)>0){
                System.out.println(ans);
            }
            return;
        }
        char cc;
        for(int i=0;i<str2.length();i++){
            cc=str2.charAt(i);
            lexiSort(str1,str2.substring(0,i)+str2.substring(i+1),ans+cc);
        }

    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=str1;
        char[] strArray = str2.toCharArray();
        Arrays.sort(strArray); // sort krke input cab=abc kiye then cases.

        lexiSort(str1,new String(strArray),"");
    }
}
