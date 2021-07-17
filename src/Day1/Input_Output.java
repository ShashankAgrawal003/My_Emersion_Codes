package Day1;

import java.util.*;

public class Input_Output {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);  //input from scanner class
        int n = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        System.out.print(n + " " + str);

    }
}
