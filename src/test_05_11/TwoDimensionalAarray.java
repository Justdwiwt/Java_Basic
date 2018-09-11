package test_05_11;

public class TwoDimensionalAarray {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4};
        through(arr);
    }

    public static void through(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);
    }
}

/*
 * {2, 4} {1, 3}
 */
