package test_06_21;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main 1");
		int n = 3;
		ma(n);
		System.out.println("main 2");
	}

	public static void ma(int n) {
		try {
			System.out.println("ma1");
			mb(n);
			System.out.println("ma2");
		} catch (EOFException e) {
			System.out.println("catch EOFException");
		} catch (IOException e) {
			System.out.println("catch IOException");
		} catch (SQLException e) {
			System.out.println("catch SQLException");
		} catch (Exception e) {
			System.out.println("catch Exception");
		} finally {
			System.out.println("In finally");
		}
	}

	public static void mb(int n) throws Exception {
		System.out.println("mb1");
		if (n == 1)
			throw new EOFException();
		if (n == 2)
			throw new FileNotFoundException();
		if (n == 3)
			throw new SQLException();
		if (n == 4)
			throw new NullPointerException();
		System.out.println("mb2");
	}
}
