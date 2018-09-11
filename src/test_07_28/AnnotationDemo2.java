package test_07_28;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SAnno("value")
public class AnnotationDemo2 {
}

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@interface SAnno {
    // 当注解中只有一个属性且为value时可以省略属性名直接赋值
    String value();
}
