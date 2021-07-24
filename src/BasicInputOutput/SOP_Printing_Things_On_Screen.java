package Day1;

public class SOP_Printing_Things_On_Screen {

    public static void main(String[] args) {

        System.out.println("Hello My Name is Shashank Agrawal");
        System.out.print("Hello My Name is Shashank" + " ");  // no line change
        System.out.println("Agrawal");

        int a = 10;
        System.out.printf("The Value of a :%d", a);
        System.out.println();

        System.out.format("%03d", a);
    }
}
