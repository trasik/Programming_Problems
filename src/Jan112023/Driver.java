package Jan112023;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        //Problem 1
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        String s3 = "paper";
        String t3 = "title";

        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s2, t2));
        System.out.println(isIsomorphic(s3, t3));

        //Problem 2
        String s1b = "abc";
        String t1b = "ahbgdc";

        String s2b = "axc";
        String t2b = "ahbgdc";

        System.out.println(isSubsequence(s1b, t1b));
        System.out.println(isSubsequence(s2b, t2b));
    }

    //Problem 1
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for(int i = 0; i < s.length(); i++) {
            if(sMap[s.charAt(i)] != tMap[t.charAt(i)]) return false;

            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;

        int p1 = 0;
        int p2 = 0;

        while(p1 < s.length() && p2 < t.length()) {
            if(s.charAt(p1) == t.charAt(p2)) p1++;
            p2++;
        }

        return p1 == s.length();
    }

}
