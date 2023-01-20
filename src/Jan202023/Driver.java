package Jan202023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Min Cost Climbing Stairs
        int[] cost1 = {10,15,20};
        int[] cost2 = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost1));
        System.out.println(minCostClimbingStairs(cost2));

    }

    private static int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length == 0) return 0;

        int length = cost.length;
        int[] cache = new int[length];

        return Math.min(minCostCSHelper(cost, cache, length - 1), minCostCSHelper(cost, cache, length - 2));
    }

    private static int minCostCSHelper(int[] cost, int[] cache, int n) {
        if(n < 0) return 0;
        if(n == 0 || n == 1) return cost[n];

        if(cache[n] != 0) return cache[n];
        cache[n] = cost[n] + Math.min(minCostCSHelper(cost, cache, n - 1), minCostCSHelper(cost, cache, n - 2));
        return cache[n];
    }
}
