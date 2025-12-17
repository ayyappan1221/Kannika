public class UpperCaseManual {
    public static void main(String[] args) {

        String s = "java";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                res = res + (char) (ch - 32);
            else
                res = res + ch;
        }

        System.out.println(res);
    }
}
