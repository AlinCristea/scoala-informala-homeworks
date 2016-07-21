package ro.sci.eshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ProductDaoImpl  extends AbstractModelDao implements ProductDao {
	private int id;
    private String name;
	private String description;
	private Connection conn;

	@Override
	protected Connection getDbConnection(String type, String host, int port, String dataBase, String user,
			String password) {
		return super.getDbConnection(type, host, port, dataBase, user, password);
	}

	public ProductDaoImpl() {
		conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres", "alin1234");
	}

	public ProductDaoImpl(int id, String name ,String description) {
		this.conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres", "alin1234");
		this.id = id;
		this.name = name;
		this.description = description;
	
	}

	@Override
	public void createOrder(int id, String name ,String decription) {
		PreparedStatement ps = null;
		String sqlQuery = "INSERT INTO products(id,name,description) VALUES (" + id + ", " + name+ " ,"
				+ ""+ description + ")";

		System.out.println(sqlQuery);
		try {
			ps = conn.prepareStatement(sqlQuery);
			ps.executeQuery();
		} catch (SQLException e) {
		}
		finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void readAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;

		final String format = "%10s%12s%20s\n";

		try {

			String sqlQuery = "SELECT * FROM public.products ";
			ps = conn.prepareStatement(sqlQuery);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				System.out.format(format, "id", "name", "description");
				do {
					System.out.format(format, rs.getInt("id"), rs.getString("name"), rs.getString("description"));
				} while (rs.next());

			} else {
				System.out.println("No results");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
				}
		}
	}

	@Override
	public void readOrder(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		final String format = "%10s%12s%20s\n";

		try {
			String sqlQuery = "SELECT * FROM products WHERE id=?";
			ps = conn.prepareStatement(sqlQuery);

			ps.setInt(1, id);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				this.id = rs.getInt("id");
				this.name = rs.getString("name");
				this.description= rs.getString("description");
				
				System.out.format(format, id,name,description);

			} else {
				System.out.println("No results");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
				}
		}
	}

	@Override
	public void deleteOrder(int id) {
		PreparedStatement ps = null;
		String sqlQuery = "DELETE FROM public.products WHERE id=?";
		System.out.println(sqlQuery);
		try {
			ps = conn.prepareStatement(sqlQuery);
			ps.setInt(1, id);
			ps.executeQuery();
		} catch (SQLException e) {
		}
		finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Connection getConn() {
		return conn;
	}

}
