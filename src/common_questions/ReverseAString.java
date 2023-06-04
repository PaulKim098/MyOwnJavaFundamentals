package common_questions;

import java.util.Scanner;

public class ReverseAString {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
//        System.out.println(reverseAString());

        System.out.println(reverse("Hello"));
        System.out.println(reverse("banana"));
    }

//    public static String reverseAString(){
//        /*
//        When reversing a string you need to understand where to start
//        you are returning the string from the end to the beginning
//        set up the given string, then create a for loop utilizing StringBuilder or
//        without
//         */
//        // Method 1
//        System.out.println("Give any String:");
//        String str = scanner.nextLine();
//        String reversed = "";
//
//        for (int i = str.length()-1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        return reversed;
//    }

    public static String reverse(String str){
        if(str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    /*
    Initial call: reverse("Hello")
    Recursive calls:
    reverse("ello") + "H"
    reverse("llo") + "e" + "H"
    reverse("lo") + "l" + "e" + "H"
    reverse("o") + "l" + "l" + "e" + "H"
    Base case: return "o" (no characters to reverse)
    Concatenation:
    o + "l" + "l" + "e" + "H" = "olleH"
    Final result: "olleH"
     */

}
