package test_05_12;

import java.util.Arrays;

public class Day4Test {

    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 2, 3, 4, 1};
        System.out.println("Q1:");
        System.out.println(arrSearchN(arr1, 4));
        System.out.println("Q2:");
        reverseArray(arr1);
        System.out.println("Q3:");
        triangle(5);
        System.out.println("Q4:");
        int[] mky = new int[15];
        choiceMky(mky);
        System.out.println("Q5:");
        int[][] matrix = new int[2][5];
        matrixFlip(matrix, 2, 3);
        System.out.println("Q6:");
        spiral(4);
    }

    // 1
    public static int arrSearchN(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    // 2
    public static void matrixFlip(int[][] arr, int start, int end) {
        int[][] tp = new int[end][start];
        int i, j;
        int temp = 0;

        for (i = 0; i < start; i++)
            for (j = 0; j < end; j++) {
                temp = temp + 1;
                arr[i][j] = temp;
                System.out.println("arr" + "[" + i + "]" + "[" + j + "]" + "---" + arr[i][j]);
            }

        for (i = 0; i < start; i++)
            for (j = 0; j < end; j++)
                tp[j][i] = arr[i][j];

        System.out.println("-----------翻转后------------");

        for (i = 0; i < end; i++)
            for (j = 0; j < start; j++)
                System.out.println("after" + "[" + i + "]" + "[" + j + "]" + "---" + tp[i][j]);
    }

    // 3
    public static void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4
    public static void triangle(int num) {
        int[][] arr = new int[num + 1][];
        for (int i = 0; i <= num; i++)
            arr[i] = new int[i + 1];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                int odds = 1;
                for (int k = 1; k <= j; k++)
                    odds = odds * (i - k + 1) / k;
                arr[i][j] = odds;
            }
        for (int[] anArray : arr) {
            for (int anArr : anArray)
                System.out.printf("%4d", anArr);
            System.out.println();
        }
    }

    // 5
    public static void choiceMky(int[] arr) {
        int del = 0;
        int rest_index = 0;
        int count = 0, index = 0;
        while (del < arr.length - 1) {
            if (arr[index] == 0) {
                count++;
                if (count == 7) {
                    arr[index] = 1;
                    del++;
                    count = 0;
                } else
                    rest_index = index;
            }
            index++;
            if (index == arr.length)
                index = 0;
        }
        System.out.println("�����ǵ�" + (rest_index + 1) + "ֻ���ӣ�");
    }

    // 6
    public static void spiral(int n) {
        int[][] arr = new int[n][n];
        for (int[] anArr : arr)
            Arrays.fill(anArr, 0); // ���
        int start = 1;
        int x = 0;
        int y = 0;
        arr[0][0] = start;
        while (start < n * n) {
            while (y + 1 < n && (arr[x][y + 1] == 0))
                arr[x][++y] = ++start;
            while (x + 1 < n && (arr[x + 1][y] == 0))
                arr[++x][y] = ++start;
            while (y - 1 >= 0 && (arr[x][y - 1] == 0))
                arr[x][--y] = ++start;
            while (x - 1 >= 0 && (arr[x - 1][y] == 0))
                arr[--x][y] = ++start;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
