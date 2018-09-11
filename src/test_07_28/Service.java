package test_07_28;

@SuppressWarnings("ALL")
public class Service {
    Dao d = new MySQLDao();

    public void add(String name) {
        d.add("111");
    }

    public void delete(String name) {
        d.delete(name);
    }
}
