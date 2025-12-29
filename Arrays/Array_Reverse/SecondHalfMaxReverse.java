package Arrays;

import java.util.*;

public class SecondHalfMaxReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int half = (n / 2); // starting index of 2nd half
        for (int i = 0; i < (n - half) / 2; i++) {
            int t = a[half + i];
            a[half + i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
