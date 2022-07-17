package tasks;

public class Palindrome {

    public static boolean checkPalindrome(String line) {
        StringBuilder org_str = new StringBuilder(line);
        StringBuilder rev_str = org_str.reverse();
        if (line.equals(String.valueOf(rev_str))){
            return true;
        }
        return false;
    }



}
