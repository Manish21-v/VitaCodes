package etour.manager;

import java.util.List;

import etour.pojo.Customerdetail;

public interface CustomerManager
{
	void addCustomer(Customerdetail c);
	List<Customerdetail> getCustomers();
	void delete (int customerid);
	void update( Customerdetail customer, int customerid);
	Customerdetail getCustomer(int customerid);
	

}
