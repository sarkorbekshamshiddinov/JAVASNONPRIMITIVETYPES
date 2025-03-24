import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();

        String concat1 = s1.concat(s2);
        String concat2 = s2.concat(s1);

        if (concat1.equals(concat2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        if (isAlterneting(s1, s2)) {
            System.out.println("Alternating");
        } else {
            System.out.println("Not alternating");
        }
        sc.close();
    }

      private static boolean isAlterneting(String s1, String s2) {
          int len1 = s1.length(), len2 = s2.length();
          int minLen = Math.min(len1, len2);

          for (int i = 0; i < minLen; i++) {
              if (s1.charAt(i) != s2.charAt(i)) {
                  return false;
              }
          }
          return false;
      }
}
