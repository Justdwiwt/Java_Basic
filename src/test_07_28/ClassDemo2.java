package test_07_28;

public class ClassDemo2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<Object> clz = (Class<Object>) Class.forName("java.lang.Object");
        Object o = clz.newInstance();
        System.out.println(o);

        Class<String> clz2 = (Class<String>) Class.forName("java.lang.String");
        String str = clz2.newInstance();
        System.out.println(clz2);

        Class<Integer>clz3=Integer.class;
        Integer in = clz3.newInstance();
        System.out.println(in);
    }
}
