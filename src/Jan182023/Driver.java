package Jan182023;

public class Driver {

    public static void main(String[] args) {
        //Problem 1: Flood Fill
        int[][] picture1 = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        System.out.println("Before: ");
        print2DArray(picture1);
        System.out.println("After: ");
        print2DArray(floodFill(picture1, 1, 1, 2));

        //Problem 2: Number of Islands
        char[][] islands1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        char[][] islands2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println("\nIslands");
        print2DArray(islands1);
        System.out.println("Total Islands: " + numIslands(islands1));

        System.out.println("\nIslands");
        print2DArray(islands2);
        System.out.println("Total Islands: " + numIslands(islands2));

    }

    //Problem 1: Flood Fill
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color != newColor) floodFill(image, sr, sc, color, newColor);
        return image;
    }

    public static void floodFill(int[][] image, int row, int col, int color, int newColor) {
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != color) return;
        image[row][col] = newColor;
        floodFill(image, row + 1, col, color, newColor);
        floodFill(image, row - 1, col, color, newColor);
        floodFill(image, row, col + 1, color, newColor);
        floodFill(image, row, col - 1, color, newColor);
    }

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int totalIslands = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    numIslands(grid, i, j);
                    totalIslands++;
                }
            }
        }

        return totalIslands;
    }

    private static void numIslands(char[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] != '1') return;
        grid[row][col] = '0';
        numIslands(grid, row + 1, col);
        numIslands(grid, row - 1, col);
        numIslands(grid, row, col + 1);
        numIslands(grid, row, col - 1);
    }

    //Helper Functions
    private static void print2DArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for(int j = 0; j < arr[0].length; j++) {
                if(j == arr[0].length - 1) System.out.print(arr[i][j]);
                else System.out.print(arr[i][j] + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void print2DArray(char[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for(int j = 0; j < arr[0].length; j++) {
                if(j == arr[0].length - 1) System.out.print(arr[i][j]);
                else System.out.print(arr[i][j] + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
