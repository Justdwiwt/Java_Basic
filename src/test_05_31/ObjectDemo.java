package test_05_31;

public class ObjectDemo implements Cloneable {
    int i = 10;

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectDemo ob = new ObjectDemo();
        ObjectDemo od = (ObjectDemo) ob.clone();
        System.out.println(od.i);
        System.out.println(ob.equals(od));
    }
}
