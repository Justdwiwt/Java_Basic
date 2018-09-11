package test_07_28;

public class ClassDemo1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<String> clz = String.class;
//        System.out.println(clz);
//        Class<List> clz2 = List.class;
//        Class<int[]> clz3 = int[].class;
//        Class clz4 = double.class;
//        Object o = "123";
//        Class<Object> clz5 = (Class<Object>) o.getClass();
//        System.out.println(clz5);
        Class<String> clz6 = (Class<String>) Class.forName("java.lang.String");
        System.out.println(clz6);
    }
}
