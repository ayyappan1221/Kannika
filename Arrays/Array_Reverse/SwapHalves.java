package Arrays.Array_Reverse;

import java.util.Scanner;

public class SwapHalves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int mid = n / 2;

        if (n % 2 == 0) {
            for (int i = 0; i < mid; i++) {
                int temp = a[i];
                a[i] = a[i + mid];
                a[i + mid] = temp;
            }
        } else {
            for (int i = 0; i < mid; i++) {
                int temp = a[i];
                a[i] = a[i + mid + 1];
                a[i + mid + 1] = temp;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}