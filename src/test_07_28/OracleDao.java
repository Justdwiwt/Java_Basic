package test_07_28;

public class OracleDao implements Dao {
    @Override
    public void add(String str) {
        System.out.println("add:" + str);
    }

    @Override
    public void delete(String str) {
        System.out.println("delete:" + str);
    }
}
