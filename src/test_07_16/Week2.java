package test_07_16;

public class Week2 {
    public static void main(String[] args) {
        Week2 inc = new Week2();
        int i = 0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);

    }

    void fermin(int i) {
        i++;
    }
}
