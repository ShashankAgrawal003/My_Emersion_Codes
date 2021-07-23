//Replace all occurrences of pi with 3.14
package Codenation_Tasks.Recursion;
import java.util.*;
public class ReplaceAllPI {
    public static String fun(String str,int curr){
        String ans="";
        if(curr==str.length()-1){
            return ans+str.charAt(curr);
        }

        if(curr<str.length()-1){
            char cc=str.charAt(curr);
            char cc1=str.charAt(curr+1);
            if(cc=='p'&& cc1=='i'){
                ans+="3.14"+fun(str,curr+2);
            }
            else{
                ans+=cc+fun(str,curr+1);
            }

        }
        return ans;

    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();

        for(int i=1;i<=t;i++){
            String str=s.nextLine();
            String ans=fun(str,0);
            System.out.println(ans);
        }

    }
}
