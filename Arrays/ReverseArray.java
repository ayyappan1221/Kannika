package Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        /*
         * for (int i = 0; i < n / 2; i++) {
         * int temp = a[i];
         * a[i] = a[n - 1 - i];
         * a[n - 1 - i] = temp;
         * }
         */
        int half = (n / 2) + 1; // include middle
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
/*
 * Reverse the first half of the array min
 * 
 * int K=n/2;
 * for(int i=0;i<K/2;i++){
 * int t=a[i];
 * a[i]=a[K-1-i];
 * a[K-1-i]=t;
 * }
 */

/*
 * Reverse the first half of the array max
 *
 * int K=(n/2)+1;
 * for(int i=0;i<K/2;i++){
 * int t=a[i];
 * a[i]=a[K-1-i];
 * a[K-1-i]=t;
 * }
 */