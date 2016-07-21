package ro.sci.eshop;

import java.util.Date;

public interface OrderItemDao {

	void createOrderItem(int id,int id_order,int quantity, int id_product);

	void readAll();

	void readOrderItem(int id);

	void deleteOrderItem(int id);
}
