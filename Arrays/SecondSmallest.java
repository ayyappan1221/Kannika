package Arrays;

import java.util.*;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int min = a[0];
        int second = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] != min) {
                if (!found) {
                    second = a[i];
                    found = true;
                } else if (a[i] < second) {
                    second = a[i];
                }
            }
        }

        if (!found)
            System.out.println("Second smallest ");
        else
            System.out.println("Second smallest: " + second);
        sc.close();
    }
}
