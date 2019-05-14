package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public class CircleImpl {

	private JDBCConnection jdbcConn = new JDBCConnection();
	private Connection conn = jdbcConn.getConnection();
	
	public Circle get(int id) {
		String sql = "SELECT name FROM test.circle WHERE id=?";
		try {
			
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, id);

			ResultSet rs = stm.executeQuery();
			Circle circle = new Circle();
			if (rs.next())
				circle.setName(rs.getString("name"));
			rs.close();
			conn.close();
			return circle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
