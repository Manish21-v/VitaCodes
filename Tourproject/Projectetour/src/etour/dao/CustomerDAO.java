package etour.dao;

import java.util.List;

import etour.pojo.Customerdetail;

public interface CustomerDAO 
{
	void addCustomer(Customerdetail c);
	List<Customerdetail> getCustomers();
	void delete (int customerid);
	void update( Customerdetail customer, int customerid);
	Customerdetail getCustomer(int customerid);	
}