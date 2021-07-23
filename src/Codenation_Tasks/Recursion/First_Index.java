//Take as input N, the size of array. Take N more inputs and store that in an array.
//Take as input M, a number. Write a recursive function which returns the first index at
//which M is found in the array and -1 if M is not found anywhere. Print the value returned.

package Codenation_Tasks.Recursion;
import java.util.*;
public class First_Index {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=-1;
        int m=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                ans=i;
                break;
            }
        }
        System.out.print(ans);


    }
}
