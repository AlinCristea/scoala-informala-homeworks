package ro.sci.eshop;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		loadDriver();
		CustomerDaoImpl customer = new CustomerDaoImpl();
		if (customer.getConn() == null)
			return;

		OrderDaoImpl order = new OrderDaoImpl();
		if (order.getConn() == null)
			return;

		OrderItemDaoImpl orderItems = new OrderItemDaoImpl();
		if (orderItems.getConn() == null)
			return;
		
		ProductDaoImpl product=new ProductDaoImpl();
		if (product.getConn() == null)
			return;

		//customer.createCustomer(6, "jdj", "asdasdAS");
		//customer.createCustomer(7, "rhd", "jdkgS");
		//customer.readAll();
		//System.out.println("#################");
		//customer.deleteCustomer(6);
		//customer.readAll();
		order.createOrder(1, 23.5, new Date(), true, 7);
		order.createOrder(2, 23.5, new Date(), true, 8);
		System.out.println("#################");
		order.readAll();
	System.out.println("#################");
		order.deleteOrder(2);
	
		//order.readAll();
		//orderItems.createOrderItem(1, 2, 23, 8);
		//orderItems.createOrderItem(3, 4, 53, 7);
		//orderItems.readAll();
		//orderItems.deleteOrderItem(3);
		

	}

	public static void loadDriver() {

		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
