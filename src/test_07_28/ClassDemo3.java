package test_07_28;

import java.lang.reflect.Constructor;

public class ClassDemo3 {
    @SuppressWarnings("JavaReflectionMemberAccess")
    public static void main(String[] args) throws ReflectiveOperationException {
//        Class<Integer> clz = Integer.class;
//        Constructor<Integer> c = clz.getConstructor(int.class);
//        Integer in = c.newInstance(5);
//        System.out.println(in);
        Class<String> clz = String.class;
//        Constructor<String> c = clz.getConstructor(String.class);
//        String str = clz.newInstance("qqq");
//        Constructor<String> ci = clz.getConstructor(char[].class,boolean.class);
        Constructor<String> c = clz.getDeclaredConstructor(char[].class, boolean.class);
        System.out.println(c);
    }
}
