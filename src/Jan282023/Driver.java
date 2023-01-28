package Jan282023;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Spiral Order
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        printList(spiralOrder(matrix1));
        printList(spiralOrder(matrix2));

        //Problem 2: Longest Common Prefix
        String[] strings1 = {"flower","flow","flight"};
        String[] strings2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
    }

    //Problem 1: Spiral Order
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while(true) {
            for(int i = left; i <= right; i++) spiral.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++)  spiral.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) spiral.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) spiral.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }

        return spiral;
    }

    //Problem 2: Longest Common Prefix
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++) {
            String current = strs[i];
            while(current.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.length() == 0) return "";
            }
        }

        return prefix;
    }

    //Helper Functions
    private static void printList(List<Integer> list) {
        System.out.print("[");
        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) System.out.print(list.get(i));
            else System.out.print(list.get(i) + ",");
        }
        System.out.print("]");
        System.out.println();
    }
}
