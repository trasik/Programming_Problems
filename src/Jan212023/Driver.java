package Jan212023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Find all Anagrams
        String s1 = "cbaebabacd";
        String p1 = "abc";
        String s2 = "abab";
        String p2 = "ab";

        printList(findAnagrams(s1, p1));
        printList(findAnagrams(s2, p2));

        //Problem 2: Longest Repeating Character Replacement
        String s2a = "ABAB";
        String s2b = "AABABBA";
        System.out.println("Max Length: " + characterReplacement(s2a, 2));
        System.out.println("Max Length: " + characterReplacement(s2b, 1));
    }

    //Problem 1
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> aIndexes = new ArrayList<>();
        if(p.length() > s.length()) return aIndexes;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();

        //Count the first three p length characters in both strings
        for(int i = 0; i < p.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }

        int left = 0;
        int right = p.length();

        while(right < s.length()) {
            if(sMap.equals(pMap)) aIndexes.add(left);

            //Start moving to next character in S string
            char acquire = s.charAt(right);
            sMap.put(acquire, sMap.getOrDefault(acquire, 0) + 1);

            //Remove the character outside the window of p length to the left
            char discard = s.charAt(left);
            if(sMap.get(discard) == 1) sMap.remove(discard);
            else sMap.put(discard, sMap.getOrDefault(discard, 0) - 1);

            left++;
            right++;
        }

        if(sMap.equals(pMap)) aIndexes.add(left);

        return aIndexes;
    }

    //Problem 2
    public static int characterReplacement(String s, int k) {
        if(s.length() == 0) return 0;
        int[] map = new int[26];
        int start = 0;
        int maxLength = 0;

        for(int end = 0; end < s.length(); end++) {
            maxLength = Math.max(maxLength, ++map[s.charAt(end) - 'A']);

            if(end - start + 1 > maxLength + k) {
                map[s.charAt(start) - 'A']--;
                start++;
            }
        }

        return s.length() - start;
    }

    //Helper
    private static void printList(List<Integer> list) {
        if(list == null || list.size() == 0) return;
        System.out.print("[");
        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) System.out.print(list.get(i));
            else System.out.print(list.get(i) + ",");
        }
        System.out.println("]");
    }
}
