package Day2;

import java.util.*;

public class LeftShift_RightShift_ByOneIndex {
    public static void main(String[] args) {
        int temp;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};  // 2345671 as output required Right shift
        int arr2[] = {1, 2, 3, 4, 5, 6, 7}; // 712346 as output required left shift
        int n = arr.length;
        System.out.print("Input Array:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        temp = arr[0];
        for (int i = 0; i < n - 1; i++) { //right

            arr[i] = arr[i + 1];

        }
        arr[n - 1] = temp;


        System.out.print("Right shift:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        temp = arr2[n - 1];
        for (int i = n - 1; i > 0; i--) {  //left

            arr2[i] = arr2[i - 1];

        }
        arr2[0] = temp;
        System.out.print("Left shift:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr2[i] + " ");
        }
    }
}
