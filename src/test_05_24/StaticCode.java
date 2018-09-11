package test_05_24;

public class StaticCode {
    public static void main(String[] args) {
        new SB();
    }
}

@SuppressWarnings("ALL")
class SA {
    static Sc s = null;

    static {
        System.out.println("SA");
    }

    {
        System.out.println("A 1");
    }

    public SA() {
        System.out.println("A 2");
    }
}

@SuppressWarnings("ALL")
class SB extends SA {
    Sc s = new SD();

    static {
        System.out.println("SB");
    }

    {
        System.out.println("B 1");
    }

    public SB() {
        System.out.println("B 2");
    }
}

class Sc {
    public Sc() {
        System.out.println("SC");
    }
}

class SD extends Sc {
    public SD() {
        System.out.println("SD");
    }
}