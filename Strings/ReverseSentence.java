import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = "";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
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
