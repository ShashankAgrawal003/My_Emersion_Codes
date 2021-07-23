package HackerRank;
import java.util.*;
public class Code1 {
    public static void countSort(int[] arr,int n){
        int count[]=new int[9];
        for(int i=0;i<9;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
            }
        for(int i:count){
            System.out.print(i);
        }
    }
    public static void main(String args[]){
        int arr[]={0,1,1,2,2,2};
        int n=arr.length;
        countSort(arr,n);
    }
}
