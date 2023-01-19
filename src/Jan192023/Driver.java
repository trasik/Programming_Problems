package Jan192023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Fibonacci Number
        System.out.println(fib(4));
        System.out.println(fib(9));
        System.out.println(fibMemo(4));
        System.out.println(fibMemo(9));
    }

    //Problem 1: Fibonacci (No Memo)
    public static int fib(int n) {
        if(n < 0) return -1;
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    //Problem 1: Fibonacci (Memo)
    static int[] memo = new int[1000];
    public static int fibMemo(int n) {
        if(memo[n] != 0) return memo[n];
        if(n <= 1) return n;
        memo[n] = fibMemo(n - 1) + fibMemo(n - 2);
        return memo[n];
    }

}
