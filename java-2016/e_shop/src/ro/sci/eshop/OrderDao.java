package ro.sci.eshop;


import java.util.Date;

public interface OrderDao {

	void createOrder(int id, double value, Date date, boolean confirmed, int id_customer);

	void readAll();

	void readOrder(int id);

	void deleteOrder(int id);
}
