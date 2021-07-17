package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Input_Output_BufferedReader_Class {
    public static void main(String Args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(br.readLine());
        System.out.println(str + " " + a);

        // StringTokenizer using
        System.out.println("Enter two value space separated");
        StringTokenizer st = new StringTokenizer(br.readLine()); //45 5
        int n1 = Integer.parseInt(st.nextToken());   //45
        int n2 = Integer.parseInt(st.nextToken());   //5
        int ans = n1 + n2;                             //45+5=50
        System.out.println(n1 + " " + n2 + " " + ans);


    }
}
