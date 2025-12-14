public class nestedwhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println("Outer loop iteration: " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("  Inner loop iteration: " + j);
                j++;
            }
            i++;
        }
        System.out.println("Nested loops completed.");
    }
}