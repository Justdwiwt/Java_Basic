package test_07_26;

public class Test {
    private int m() {
        return 0;
    }

    protected double m(int i, double j) {
        return 0;
    }

    private double m(double j, int i) {
        Boolean b = new Boolean(null);
        return 0;
    }

    protected double m(int f) {
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr.length);
    }

    public static P n() {

        return new P();
    }
}

class P {
}

class IOEception extends Exception {
    static final long serialVersionUID = 7818375828146090155L;

    public IOEception() {
    }

    public IOEception(String message) {
        super(message);
    }

    public IOEception(String message, Throwable cause) {
        super(message, cause);
    }

    public IOEception(Throwable cause) {
        super(cause);
    }

}