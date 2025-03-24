import java.util.Scanner;

public class task5forlab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.nextLine();

        String lowerCase = word.toLowerCase();

        String palindrome = "";
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            palindrome += lowerCase.charAt(i);
        }
        System.out.println(palindrome);
        if(lowerCase.equals(palindrome)) {
            System.out.println("Word is a palindrome");
        } else {
            System.out.println("Word is not a palindrome");
        }
    }
}
