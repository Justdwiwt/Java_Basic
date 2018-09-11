package test_06_20;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo1 {
    public static void main(String[] args) {

    }
}

class A {
    public void m() throws IOException {
    }

    public void m(int i) throws SQLException {
    }
}

class B extends A {
    @Override
    public void m() throws EOFException {
        // TODO Auto-generated method stub
    }

    @Override
    public void m(int i) throws SQLException {
       // TODO Auto-generated method stub
    }
}