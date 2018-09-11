package test_05_10;

public class ArraySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // search2(arr, 5);
        System.out.println(binarySearch(arr, 2));
    }

    public static void search1(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (key == arr[i])
                System.out.println(i);
    }

    public static void search2(int[] arr, int key) {
        int count = 0;
        for (int anArry : arr) {
            if (anArry == key) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (high + low) >>> 1;
            if (key == arr[middle])
                return middle;
            else if (key < arr[middle])
                high = middle - 1;
            else
                low = middle + 1;
        }
        return -1;
    }
}
