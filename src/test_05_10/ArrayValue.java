package test_05_10;

public class ArrayValue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(getArrayMax(arr));
        System.out.println(getArrayMin(arr));
    }

    public static int getArrayMax(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++)
            if (max < n[i])
                max = n[i];
        return max;
    }

    public static int getArrayMin(int[] n) {
        int min = n[0];
        for (int i = 0; i < n.length; i++)
            if (min > n[i])
                min = n[i];
        return min;
    }
}
