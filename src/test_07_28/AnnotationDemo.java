package test_07_28;

@Time(year = 2018, month = {7, 8})
public class AnnotationDemo {
}

@interface Time {
    // 注解中定义的属性默认是静态常量--public static final
//    int year = 10;
    // 注解中的属性
    int year();

    // 指定默认值
    int[] month();

    int day() default 28;


}