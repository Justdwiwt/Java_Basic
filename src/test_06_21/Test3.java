package test_06_21;

import java.io.IOException;
import java.sql.SQLException;

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println("main1");
			ma();
			System.out.println("main2");
		} catch (Exception e) {
			System.out.println("catch Exception in main");
			System.out.println(e.getMessage());
		}
	}

	public static void ma() throws IOException {
		try {
			System.out.println("ma1");
			mb();
			System.out.println("ma2");
		} catch (SQLException e) {
			System.out.println("catch SQLException in ma");
			throw new IOException(e.getMessage());
		} catch (Exception e) {
			System.out.println("catch Exception in ma");
			System.out.println(e.getMessage());
		}
	}

	public static void mb() throws SQLException {
		throw new SQLException("sql exception in mb");
	}
}
