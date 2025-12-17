import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                res = res + s.charAt(i);
        }

        System.out.println(res);
        sc.close();
    }
}
