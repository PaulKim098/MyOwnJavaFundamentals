package common_questions;

public class ReverseAStringCharArray {
    public static void main(String[] args) {
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(str));
    }

    public static String reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }

        return new String(s);
    }
    /*
    Initialization:

    s = ['H', 'e', 'l', 'l', 'o']
    left = 0
    right = 4 (length of s - 1)
    First iteration:

    Swap s[left] and s[right]:
    temp = 'o'
    s[right] = 'H'
    s[left] = 'o'
    After the swap: s = ['o', 'e', 'l', 'l', 'H']
    Increment left to 1 and decrement right to 3
    Second iteration:

    Swap s[left] and s[right]:
    temp = 'l'
    s[right] = 'e'
    s[left] = 'l'
    After the swap: s = ['o', 'l', 'l', 'e', 'H']
    Increment left to 2 and decrement right to 2
    Loop ends because left is no longer less than right.

    Conversion and return:

    Convert the character array s to a string: "olleH"
    Return the reversed string: "olleH"
    The reversed string "olleH" is then printed as the output.

    During each iteration of the loop, the code swaps the characters at the left
    and right positions in the character array s. This swapping process continues
    until the left pointer is no longer less than the right pointer, which indicates
    that all the necessary characters have been swapped.

    The code performs the swaps in-place, meaning it modifies the original character
    array s. Finally, it converts the reversed character array back to a string and
    returns it.
     */
}
