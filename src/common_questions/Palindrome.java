package common_questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("civic"));
//        System.out.println(isPalindrome("nomon"));
//        System.out.println(isPalindrome("stanley yelnats"));
//        System.out.println(isPalindrome("soup"));

        System.out.println(isPalindrome(14541));
        System.out.println(isPalindrome(929393929));
        System.out.println(isPalindrome(87245));
        System.out.println(isPalindrome(191));
    }

    public static boolean isPalindrome(int number){ // String number
//        StringBuilder reverse = new StringBuilder();
//
//        for (int i = str.length()-1; i >= 0; i--) {
//            reverse.append(str.charAt(i));
//        }
//        return reverse.toString().equals(str) ? "This is a Palindrome" : "This is not a Palindrome";
        int originalNumber = number;
        int reversedNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        }

        /* Given any number that is a possible palindrome. It should return the reverse.
           If the given number was 12321 then it will be set as the original number, reversedNumber
           will still be set at 0. Then it will iterate into the loop where digit = 12321 % 10 = 1.
           Next reversedNumber = 0 * 10 + 1 = 1 (digit is added as 1). Then 12321/10 = 1232. Then the next iteration will be
           the original number of 1232.

           Second Iteration
           digit = 1232 % 10 = 2
           reversedNumber = 1 * 10 + 2 = 12
           number = 1232 / 10 = 123

           Repeat steps until exits out of loop. If original number equates
           to the reverse then it is a Palindrome.


         */

}
