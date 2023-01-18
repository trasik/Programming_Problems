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
}
