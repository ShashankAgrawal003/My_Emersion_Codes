//Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
//The output strings should be printed in the sorted order considering '(' has higher value than ')'.
//Sample Input 2
//Sample Output ()() , (())
package Codenation_Tasks.Recursion;
import java.util.*;
public class GenerateParentesis {
    public static void parentesis(String ans,int oc,int cc,int n){
        if(oc==n && cc==n){
            System.out.println(ans);
            return;
        }
//pahle close ka case AS close ki place milte hi close kr rha vo pahle.
        if(oc>cc){
            parentesis(ans+')',oc,cc+1,n);
        }
        if(oc<n){
            parentesis(ans+'(',oc+1,cc,n);
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        parentesis("",0,0,n);

    }
}
