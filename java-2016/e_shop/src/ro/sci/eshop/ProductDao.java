package ro.sci.eshop;

import java.util.Date;

public interface ProductDao {
	void createOrder(int id, String name ,String description);

	void readAll();

	void readOrder(int id);

	void deleteOrder(int id);
}


