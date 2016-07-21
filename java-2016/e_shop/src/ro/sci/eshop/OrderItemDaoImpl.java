package ro.sci.eshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class OrderItemDaoImpl extends AbstractModelDao implements OrderItemDao {
	private int id;
	private int id_order;
	private int quantity;
	private int id_product;
	private Connection conn;

	@Override
	protected Connection getDbConnection(String type, String host, int port, String dataBase, String user,
			String password) {
		return super.getDbConnection(type, host, port, dataBase, user, password);
	}

	public OrderItemDaoImpl() {
		conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres", "alin1234");
	}

	public OrderItemDaoImpl(int id, int id_order, int quantity, int id_product) {
		this.conn = getDbConnection("postgresql", "localhost", 5433, "eshop", "postgres", "alin1234");
		this.id = id;
		this.id_order = id_order;
		this.quantity = quantity;
		this.id_product = id_product;

	}

	@Override
	public void createOrderItem(int id, int id_order, int quantity, int id_product) {
		PreparedStatement ps = null;
		String sqlQuery = "INSERT INTO orderitems(id ,id_order,quantity,id_product) VALUES (" + id + ", " + id_order
				+ ","

				+ quantity + ", " + id_product + ")";

		System.out.println(sqlQuery);
		try {
			ps = conn.prepareStatement(sqlQuery);
			ps.executeQuery();
		} catch (SQLException e) {
		} finally {
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

		final String format = "%10s%12s%20s%12s\n";

		try {

			String sqlQuery = "SELECT * FROM public.orderitems ";
			ps = conn.prepareStatement(sqlQuery);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				System.out.format(format, "id", "id_order", "quantity", "id_product");
				do {
					System.out.format(format, rs.getInt("id"), rs.getInt("id_order"), rs.getInt("quantity"),
							rs.getInt("id_product"));
				} while (rs.next());

			} else {
				System.out.println("No results");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	public void readOrderItem(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		final String format = "%10s%12s%20s%12s\n";

		try {
			String sqlQuery = "SELECT * FROM orderitems WHERE id=?";
			ps = conn.prepareStatement(sqlQuery);

			ps.setInt(1, id);
			rs = ps.executeQuery();

			boolean hasResults = rs.next();
			if (hasResults) {

				this.id = rs.getInt("id");
				this.id_order = rs.getInt("id_order");
				this.quantity = rs.getInt("quantity");
				this.id_product = rs.getInt("id_product");
				System.out.format(format, id, id_order, quantity, id_product);

			} else {
				System.out.println("No results");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	public void deleteOrderItem(int id) {
		PreparedStatement ps = null;
		String sqlQuery = "DELETE FROM public.orderitems WHERE id=?";
		System.out.println(sqlQuery);
		try {
			ps = conn.prepareStatement(sqlQuery);
			ps.setInt(1, id);
			ps.executeQuery();
		} catch (SQLException e) {
		} finally {
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

	public int getId_order() {
		return id_order;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getId_product() {
		return id_product;
	}

	public Connection getConn() {
		return conn;
	}

}
