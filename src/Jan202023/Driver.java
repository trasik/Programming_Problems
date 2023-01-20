package Jan202023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Min Cost Climbing Stairs
        int[] cost1 = {10,15,20};
        int[] cost2 = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost1));
        System.out.println(minCostClimbingStairs(cost2));

        //Problem 2: Unique Paths
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 2));

    }

    //Problem 1
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

    //Problem 2: Unique Paths

    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        //Populate the first row and column with 1's
        for(int i = 0; i < m; i++) {
            grid[i][0] = 1;
        }

        for(int i = 0; i < n; i++) {
            grid[0][i] = 1;
        }

        //Calculate the iTH and jTH grid item based on previous row and previous column
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }

        return grid[m - 1][n - 1];
    }
}
