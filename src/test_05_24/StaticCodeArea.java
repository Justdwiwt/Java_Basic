package test_05_24;

public class StaticCodeArea {
    public static void main(String[] args) {
        SC.m();
    }
}

@SuppressWarnings("ALL")
class SC {
    static {
        System.out.println("静态构造代码块,随着类的加载而加载");
    }

    {
        System.out.println("构造代码块");
    }

    public SC() {
        System.out.println("无参构造");
    }

    public static void m() {
        System.out.println("m");
    }
}
