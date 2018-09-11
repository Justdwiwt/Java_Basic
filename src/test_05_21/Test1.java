package test_05_21;

import org.junit.Test;

public class Test1 {
    public static void main(String[] args) {
    }

    @Test
    public void testType() {
        if (isType(1)) {
            System.out.println("Type");
        } else {
            System.out.println("Not Type");
        }
    }

    public boolean isType(int type) {
        return type != 1;
    }
}
