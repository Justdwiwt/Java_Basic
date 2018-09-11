package test_05_31;

@SuppressWarnings("ALL")
public class Test2 {
    public static void main(String[] args) {
        IC ic = new ClassE();
        ((ClassE) ic).ma();
        ((ClassE) ic).mb();
        ic.mc();
        ((ClassE) ic).md();
        System.out.println("---------");
        System.out.println(ic instanceof IA2);
        System.out.println(ic instanceof IB);
        System.out.println(ic instanceof IC);
        System.out.println(ic instanceof ID);
        System.out.println(ic instanceof ClassE);
    }
}

interface IA2 {
    void ma();
}

interface IB extends IA2 {
    void mb();
}

interface IC {
    void mc();
}

interface ID extends IB, IC {
    void md();
}

class ClassE implements ID {

    @Override
    public void ma() {

    }

    @Override
    public void mb() {

    }

    @Override
    public void mc() {

    }

    @Override
    public void md() {

    }
}