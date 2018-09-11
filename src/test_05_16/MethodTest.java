package test_05_16;

public class MethodTest {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = {1, 2, 3, 4, 5};
        // 实参
        result(num);// 执行完毕立即清除
        int temp = result1(arr[1]);
//        System.out.println(ArraySearch.binarySearch(arr, 3));
        result2(arr);
        System.out.println(num);
        System.out.println(arr[1]);
        System.out.println(temp);
        System.out.println(arr[2]);
    }

    // 形参
    @SuppressWarnings("UnusedReturnValue")
    private static int result(int num) {
        return num += 5;
    }

    private static int result1(int num) {
        return num += 5;
    }

    @SuppressWarnings("UnusedReturnValue")
    private static int result2(int[] num) {
        return num[2] += 5;
    }
}
