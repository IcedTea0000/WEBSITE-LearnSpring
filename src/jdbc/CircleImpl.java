package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CircleImpl {

	public Circle get(int id) {
		JDBCConnection jdbcConn = new JDBCConnection();
		Connection conn = jdbcConn.getConnection();
		String sql = "SELECT name FROM test.circle WHERE id=?";
		try {

			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, id);

			ResultSet rs = stm.executeQuery();
			Circle circle = new Circle();
			if (rs.next())
				circle.setName(rs.getString("name"));
			return circle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
