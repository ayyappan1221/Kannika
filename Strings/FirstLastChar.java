import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("First: " + s.charAt(0));
        System.out.println("Last: " + s.charAt(s.length() - 1));

        sc.close();
    }
}
