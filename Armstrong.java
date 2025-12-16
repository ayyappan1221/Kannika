import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0, sum = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;
        while (temp > 0) {
            int d = temp % 10;
            int pow = 1;
            for (int i = 1; i <= count; i++) {
                pow = pow * d;
            }
            sum = sum + pow;
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        sc.close();
    }
}