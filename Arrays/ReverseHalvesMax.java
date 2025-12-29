package Arrays;

import java.util.*;

public class ReverseHalvesMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int mid = n / 2; // middle included in first half

        // reverse first half including mid
        for (int i = 0; i <= mid / 2; i++) {
            int t = a[i];
            a[i] = a[mid - i];
            a[mid - i] = t;
        }

        // reverse second half excluding mid
        int start = mid + 1;
        for (int i = 0; i < (n - start) / 2; i++) {
            int t = a[start + i];
            a[start + i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
