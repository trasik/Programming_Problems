package Feb172023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Roman to Integer
        String input1 = "III";
        String input2 = "LVIII";
        String input3 = "MCMXCIV";

        System.out.println(input1 + " Converts to: " + romanToInt(input1));
        System.out.println(input2 + " Converts to: " + romanToInt(input2));
        System.out.println(input3 + " Converts to: " + romanToInt(input3));
    }

    //Problem 1: Roman to Integer
    public static int romanToInt(String s) {
        if(s == null || s.length() == 0) return -1;

        int number = 0;
        int previous = 0;
        int answer = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }

            if(number < previous) {
                answer -= number;
            } else {
                answer += number;
            }

            previous = number;
        }

        return answer;
    }
}
