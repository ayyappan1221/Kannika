import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                word = c + word;
            } else {
                result = result + word + " ";
                word = "";
            }
        }

        result = result + word;
        System.out.println(result);
        sc.close();
    }
}
