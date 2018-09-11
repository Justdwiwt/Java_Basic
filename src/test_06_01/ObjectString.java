package test_06_01;

public class ObjectString {
    @SuppressWarnings({"RedundantStringConstructorCall", "StringEquality", "ConstantConditions"})
    public static void main(String[] args) {
        //字面值"ab"存储在方法区的常量池(运行时常量池),s1指向常量池中的地址
        String s1 = "ab";
        //创建一个对象,s2指向堆内存,与s1地址不同
        String s2 = new String("ab");
        //s3指向常量池中"ab"，多个字面值拼接，编译时期结果为最终结果，即拼接过程被隐藏
        String s3 = "a" + "b";
        //变量和字面值拼接时，底层调用StringBuilder的append方法，s4指向堆内存
        String s4 = "a";
        s4 = s4 + "b";
//        StringBuilder sb = new StringBuilder("a");
//        sb.append("b");
//        s4.toString();
//        s4 = new String();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s2);
        System.out.println(s3 == s4);
        System.out.println(s2 == s4);
    }
}
