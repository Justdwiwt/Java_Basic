package test_07_17;

public class FinallyTest {
    public static void main(String[] args) {
//        try {
//            System.out.println(5 / 10);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally is running");
//        }
        System.out.println(m());
        System.out.println(n());
        System.out.println(k());

        System.out.println(y());
    }

    @SuppressWarnings({"finally", "ReturnInsideFinallyBlock"})
    public static int m() {
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 2;
        } finally {
            return 5;
        }
//        return 6;
    }

    @SuppressWarnings({"finally", "ReturnInsideFinallyBlock"})
    public static int n() {
        try {
            return 1;
        } finally {
            try {
                return 2;
            } finally {
                return 3;
            }
//            return 4;
        }
    }

    @SuppressWarnings("UnusedAssignment")
    private static int k() {
        int i = 3;
        try {
            return i++;
        } finally {
            i++;
//            return i++;
        }
    }

    private static Person y() {
        Person p = new Person();
        try {
            p.setName("111");
            p.setAge(18);
            return p;
        } finally {
//            p = new Person();
            p.setName("222");
            p.setAge(20);
        }
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}