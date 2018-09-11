package test_07_29;

import java.text.ParseException;

public class DateTest extends A{
    public static void main(String[] args) throws ParseException {
        String s = null;
        A a = new A();
        a.bb();
        A.aa();

//        Integer i = new Integer("017");
//        Long l = 35;
//        Byte b = new Byte(127);
//        Float f = 'a';
//        Boolean w = new Boolean(null);
//        System.out.println(s == null || s.equals(""));
    }
}

class A {
    static void aa() {

    }

    void bb() {
        this.aa();
        this.aa();
    }


}