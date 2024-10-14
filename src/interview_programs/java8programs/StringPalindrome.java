package interview_programs.java8programs;

import java.util.function.Predicate;

public class StringPalindrome {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = str -> {
          String reversed = new StringBuilder(str).reverse().toString();
          return str.equals(reversed);
        };
        String str = "madam";
        boolean isPalindromeResult = isPalindrome.test(str);
        System.out.println(str + " is a palindrome? " + isPalindromeResult);


    }
}
