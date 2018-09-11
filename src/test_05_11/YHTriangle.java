package test_05_11;

public class YHTriangle {

    public static void main(String[] args) {
        triangle(5);
        yangH(5);
    }

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

    public static void yangH(int n) {
        int[] arr = new int[20];
        for (int i = 1; i <= n; i++) {
            int[] a = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1)
                    a[j] = arr[j] = 1;
                if (i >= 3 && j != 0 && j != i - 1)
                    a[j] = arr[j - 1] + arr[j];
            }
            for (int k = 0; k < i; k++)
                arr[k] = a[k];
            for (int k = 0; k < i; k++)
                System.out.print(a[k] + " ");
            System.out.println();
        }
    }
}
