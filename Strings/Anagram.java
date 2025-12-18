public class Anagram {
    public static void main(String[] args) {
        String a = "eat";
        String b = "ate";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        if (count == a.length())
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}