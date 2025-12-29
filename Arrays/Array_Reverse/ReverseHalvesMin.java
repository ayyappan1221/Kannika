package Arrays.Array_Reverse;

import java.util.*;

public class ReverseHalvesMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int mid = n / 2; // mid belongs to second half

        // reverse 1st half (0 to mid-1)
        for (int i = 0; i < mid / 2; i++) {
            int t = a[i];
            a[i] = a[mid - 1 - i];
            a[mid - 1 - i] = t;
        }

        // reverse 2nd half (mid to n-1)
        for (int i = 0; i < (n - mid) / 2; i++) {
            int t = a[mid + i];
            a[mid + i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
