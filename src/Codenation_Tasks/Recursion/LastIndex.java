//Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input M, a number. Write a recursive function which returns the last index
// at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

package Codenation_Tasks.Recursion;
import java.util.*;
public class LastIndex {
    public static int fun(int arr[],int n,int m){
        if(n < 0){
            return -1;
        }

        if(arr[n] == m){
            return n;
        }
        return fun(arr,n - 1,m);

    }
    public static void main(String args[]) {
        // Your Code Here tried recursion
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int m=s.nextInt();
        int ans1=fun(arr,n-1,m);
        System.out.print(ans1);
    }
}
