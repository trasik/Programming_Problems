package Jan262023;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        //Problem 1: Happy Number
        System.out.println("Is " + 19 + " a Happy Number?: " + isHappy(19));
    }

    //Problem 1: Happy Number
    private static boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();

        int squaredSum;
        int lastDigit;

        while(numbers.add(n)) {
            squaredSum = 0;
            while(n > 0) {
                lastDigit = n % 10;
                squaredSum += lastDigit * lastDigit;
                n /= 10;
            }

            if(squaredSum == 1) return true;
            else n = squaredSum;
        }

        return false;
    }
}
