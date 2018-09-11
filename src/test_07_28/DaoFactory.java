package test_07_28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("ALL")
public class DaoFactory {
    private static DaoFactory factory = new DaoFactory();
    private Properties prop;

    private DaoFactory() {
    }

    public static DaoFactory getFactory() {
        return factory;
    }

    @SuppressWarnings("unchecked")
    public Dao getInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        prop = new Properties();
        try {
            prop.load(new FileInputStream("dao.properties"));
            String dao = prop.getProperty("dao");
            Class<Dao> clz = (Class<Dao>) Class.forName(dao);
            return clz.newInstance();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
