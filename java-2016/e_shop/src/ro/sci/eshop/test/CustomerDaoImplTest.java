package ro.sci.eshop.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.sci.eshop.CustomerDaoImpl;

/**
 * This method check after the id if the name is equals with the name from table
 * The checking use id
 * 
 * @author alin
 *
 */
public class CustomerDaoImplTest {
	@Test
	public void getCustomerByIdIsValid() {
		CustomerDaoImpl customer = new CustomerDaoImpl();
		String name = customer.getCustomerById(3);

		assertEquals("mumu", name);
	}

}
