package test_05_24;

public class StaticTest {
    public static void main(String[] args) {
//        System.out.println(new SE().i);
        System.out.println(Se.i);
        System.out.println(Se.j);
    }
}

class SE {
//    int i = 1;

    {
        i = 5;
    }

    int i;
}

class Se {
    public static Se s = new Se();
    public static int i = 0;
    public static int j;

    public Se() {
        i++;
        j++;
    }
}