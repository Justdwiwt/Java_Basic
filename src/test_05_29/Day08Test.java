package test_05_29;

public class Day08Test {
    public static void main(String[] args) {
        MyClass[] myClasses = new MyClass[]{
                new TestClass(),
                new TestClass(),
                new TestClass()
        };
        MyClass.getAllClass(myClasses);
    }
}

class MyClass {
    private int count;

    public static void getAllClass(MyClass[] myClass) {
        int count = 0;
        for (MyClass myClas : myClass)
            if (myClas instanceof TestClass)
                count++;
        System.out.println(count);
    }

    public MyClass() {
    }

    public MyClass(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class TestClass extends MyClass {
    public TestClass() {
    }

    public TestClass(int count) {
        super(count);
    }
}