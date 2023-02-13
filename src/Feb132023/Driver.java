package Feb132023;

import java.util.HashSet;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Longest Substring Without Repeating Characters
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Length of Substring w.o repeating characters for String " + s1 + " : "+ lengthOfLongestSubstring(s1));
        System.out.println("Length of Substring w.o repeating characters for String " + s2 + " : "+ lengthOfLongestSubstring(s2));
        System.out.println("Length of Substring w.o repeating characters for String " + s3 + " : "+ lengthOfLongestSubstring(s3));
    }

    //Problem 1: Longest Substring Without Repeating Characters
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;

        Set<Character> seen = new HashSet<>();

        while(right < s.length()) {
            if(!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right++));
                max = Math.max(max, seen.size());
            } else {
                seen.remove(s.charAt(left++));
            }
        }

        return max;
    }
}
