package test_05_11;

import java.util.Arrays;

public class ArrayExpansion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // arrExpansion(arr, 6);
        arrCopyOf(arr, 2);
    }

    public static void arrExpansion(int[] arr, int n) {
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void arrCopyOf(int[] arr, int n) {
        arr = Arrays.copyOf(arr, n * arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
