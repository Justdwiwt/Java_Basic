package test_05_10;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        inverseArr2(arr);
    }

    public static void inverseArr1(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            array[i] = arr[arr.length - i - 1];
        arr = array;
        System.out.println(Arrays.toString(arr));
    }

    public static void inverseArr2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
