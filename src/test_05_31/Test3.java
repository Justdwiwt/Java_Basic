package test_05_31;

public class Test3 {
    public static void main(String[] args) {
        IA3 ia3 = new IAImpl();
        IBImpl ib = new IBImpl();
        ib.setIa3(ia3);
        ib.method();
    }
}

interface IA3 {
    void ma(IB2 ib2);
}

interface IB2 {
    void mb();
}

class IAImpl implements IA3 {

    @Override
    public void ma(IB2 ib2) {
        System.out.println("ma in IAImpl");
        ib2.mb();
    }
}

class IBImpl implements IB2 {
    private IA3 ia3;

    public void setIa3(IA3 ia3) {
        this.ia3 = ia3;
    }

    @Override
    public void mb() {
        System.out.println("mb in IBImpl");
    }

    public void method() {
        ia3.ma(this);
    }
}