package test_05_28;

public class Test05 {
}

class Super3 {

    public Super3(String str) {
    }

    public Super3() {
    }
}

class Sub3 extends Super3 {
    public Sub3() {
        super();
    }

    public Sub3(String str) {
        super(str);
    }
}
