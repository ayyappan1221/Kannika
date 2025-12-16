import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sq = n * n;
        int temp = n;
        boolean flag = true;

        while (temp > 0) {
            if (temp % 10 != sq % 10) {
                flag = false;
                break;
            }
            temp = temp / 10;
            sq = sq / 10;
        }

        if (flag)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
        sc.close();
    }
}
