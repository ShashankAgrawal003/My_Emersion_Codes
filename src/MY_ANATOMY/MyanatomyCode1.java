// break take out two elements from the array and check
//440=yes 5390=no
package HackerRank;
import java.util.*;
public class MyanatomyCode1 {
    public static Boolean ArrayXor(int[] arr,int n){
        int a,b;
        int result;
        Boolean ans=false;
        for(int i=0;i<n-2;i++){
            a=arr[i];
            b=arr[i+1];
            result=a^b;
            arr[i+1]=result; }
        for(int i=0;i<2;i++){
            if(arr[i]==arr[i+1]){
                 ans= true; }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Write Number of Testcases");
        int t=s.nextInt();
        Boolean ans[]=new Boolean[t];
        int j=0;
       while(t>0){
            System.out.println("Write the size of array");
            int n=s.nextInt();
            int arr[]=new int[n];

            System.out.println("Write element of array");
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            ans[j++]= Boolean.valueOf(ArrayXor(arr,n));
           t--;

      }
       for(Boolean l:ans){
           System.out.println(l);
       }
    }
}
