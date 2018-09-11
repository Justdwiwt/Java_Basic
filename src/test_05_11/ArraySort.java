package test_05_11;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 8, 7, 5, 6, 4, 3, 2};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        int min = 0;
        int temp = 0;
        if ((arr == null) || (arr.length == 0))
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
