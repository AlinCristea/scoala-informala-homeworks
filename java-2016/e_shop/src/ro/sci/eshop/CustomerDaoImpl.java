package ro.sci.eshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl extends AbstractModelDao implements CustomerDao {

	private int id;
	private String name;
	private String email;
	private Connection conn;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public CustomerDaoImpl() {
		conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres", "alin1234");
	}

	public CustomerDaoImpl(int id, String name, String email) {
		this.conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres","alin1234");
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	protected Connection getDbConnection(String type, String host, int port, String dataBase, String user,
			String password) {
		return super.getDbConnection(type, host, port, dataBase, user, password);
	}

	@Override
	public void createCustomer(int id, String name, String email) {
		
		PreparedStatement ps = null;
		String sqlQuery = "INSERT INTO customer(id, name, email) VALUES ("+id+", '"+name+"', '"+email+"')";
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
			String sqlQuery = "SELECT * FROM customer";
			ps = conn.prepareStatement(sqlQuery);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				System.out.format(format, "id", "name", "email");
				do {
					System.out.format(format, rs.getInt("id"), rs.getString("name"), rs.getString("email"));
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
	public void readCustomer(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		final String format = "%10s%12s%20s\n";

		try {
			String sqlQuery = "SELECT * FROM customer WHERE id=?";
			ps = conn.prepareStatement(sqlQuery);
			
			ps.setInt(1, id);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				this.id = rs.getInt("id");
				this.name = rs.getString("name");
				this.email = rs.getString("email");
				System.out.format(format, id, name, email);

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
	public void deleteCustomer(int id) {
		PreparedStatement ps = null;
		String sqlQuery = "DELETE FROM customer WHERE id=?";
		System.out.println(sqlQuery);
		try {
			ps = conn.prepareStatement(sqlQuery);
			ps.setInt(1, id);
			ps.executeQuery();
		} catch (SQLException e) {
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public String getCustomerById(int id) {
		String name = null;  
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			   String sqlQuery = "SELECT * FROM customer WHERE id = ?";
			   ps = conn.prepareStatement(sqlQuery);
			   ps.setInt(1, id);
		  rs = ps.executeQuery();
           while ( rs.next() ) {
                name =  rs.getString("name");
           }
			ps.close();
		   } catch (SQLException e) {
			e.printStackTrace();
		}finally{
		      try{
		         if(ps!=null)
		            conn.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return name;
	}

	public Connection getConn() {
		return conn;
	}

}

