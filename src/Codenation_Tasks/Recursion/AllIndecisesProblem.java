//Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input M, a number. Write a recursive function which returns an array containing
// indices of all items in the array which have value equal to M. Print all the values in the returned array.
package Codenation_Tasks.Recursion;
import java.util.*;

public class AllIndecisesProblem {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int m=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.print(i+" ");
            }
        }

    }
}
