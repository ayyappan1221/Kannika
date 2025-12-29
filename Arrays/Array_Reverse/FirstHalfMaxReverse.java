package Arrays.Array_Reverse;

import java.util.*;

public class FirstHalfMaxReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int half = (n / 2) + 1;
        for (int i = 0; i < half / 2; i++) {
            int t = a[i];
            a[i] = a[half - 1 - i];
            a[half - 1 - i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
