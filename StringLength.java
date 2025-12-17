import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Length of string: " + s.length());

        sc.close();
    }
}
