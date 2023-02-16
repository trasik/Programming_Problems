package Feb162023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Generate Parentheses
        int input1 = 3;
        int input2 = 6;
        int input3 = 8;

        System.out.println(Arrays.toString(generateParenthesis(input1).toArray()));
        System.out.println(Arrays.toString(generateParenthesis(input2).toArray()));
        System.out.println(Arrays.toString(generateParenthesis(input3).toArray()));
    }

    //Problem 1: Generate Parentheses
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        if(n == 0) {
            result.add("");
        } else {
            for(int i = 0; i < n; i++) {
                for(String left : generateParenthesis(i)) {
                    for(String right: generateParenthesis(n - i - 1)) {
                        result.add("(" + left + ")" + right);
                    }
                }
            }
        }

        return result;
    }
}
