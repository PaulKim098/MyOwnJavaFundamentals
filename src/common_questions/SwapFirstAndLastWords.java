package common_questions;

public class SwapFirstAndLastWords {

    public static String swapFirstAndLastWords(String str){

        String firstWord = str.substring(0, str.indexOf(' '));
        String lastWord = str.substring(str.lastIndexOf(' ') + 1);
        String middle = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' '));
        return lastWord + " " + middle + " " + firstWord;
    }
}
