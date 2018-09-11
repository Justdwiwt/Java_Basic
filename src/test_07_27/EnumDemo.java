package test_07_27;

public class EnumDemo {
    public static void main(String[] args) {
        Season s = Season.Spring;
        switch (s) {
            case Spring:
                System.out.println("spring");
                break;
            case Summer:
                System.out.println("summer");
                break;
            case Autumn:
                System.out.println("autumn");
                break;
            case Winter:
                System.out.println("winter");
                break;
        }
    }
}

@SuppressWarnings("FieldCanBeLocal")
enum Season {
    Spring {
        @Override
        public void work() {
            System.out.println("spring");
        }
    }, Summer {
        @Override
        public void work() {
            System.out.println("summer");
        }
    }, Autumn {
        @Override
        public void work() {
            System.out.println("autumn");
        }
    }, Winter {
        @Override
        public void work() {
            System.out.println("winter");
        }
    };
    private int[] months;
    private int year;

    public int[] getMonths() {
        return months;
    }

    public void setMonths(int[] months) {
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void work();
}


//class Season {
//    private Season() {
//    }
//
//    public static final Season Spring = new Season();
//    public static final Season Summer = new Season();
//    public static final Season Autumn = new Season();
//    public static final Season Winter = new Season();
//}