//In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which
// is formed by the two distinct digits ai and bi but there is a rule to form n digit integer.
//Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.
//Alice is very weak in maths section. Help her to find the number of such n digit integers.
//Input Format
//The first line contains T, the number of test cases. Further T lines contains the value n which is
// the number of digit in the integer.
//Explanation
//For n=1 : integers = a, b . For n=2 : integers = aa, ab, ba For n=3 : integers = aaa, aab, aba, baa, bab.


package Codenation_Tasks.Recursion;
import java.util.*;

public class ClassAssignment {
    public static int count=0;
    public static void fun(int n,String ans)
    {if(n==ans.length()){
        count++;
        return;
    }

        fun(n,ans+'a');
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='b'){
            fun(n,ans+'b');
        }
        return;
    }
    // b dalte time check ki just pahle b hi toh nhi dala?
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int anscount=1;
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            fun(n,"");
            System.out.println("#" + i + " " + ":" + " " + count);

            count=0;}
    }
}
