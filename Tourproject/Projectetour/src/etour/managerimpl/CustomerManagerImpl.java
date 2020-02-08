package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.CustomerDAO;
import etour.manager.CustomerManager;
import etour.pojo.Customerdetail;
@Service

public class CustomerManagerImpl implements CustomerManager
{
@Autowired
CustomerDAO dao;
	
	@Override
	public void addCustomer(Customerdetail c) {
		// TODO Auto-generated method stub
		dao.addCustomer(c);
	}

	@Override
	public List<Customerdetail> getCustomers() {
		// TODO Auto-generated method stub
		return dao.getCustomers();
	}

	@Override
	public void delete(int customerid) {
		// TODO Auto-generated method stub
		dao.delete(customerid);
	}

	@Override
	public void update(Customerdetail customer, int customerid) {
		// TODO Auto-generated method stub
		dao.update(customer, customerid);
	}

	@Override
	public Customerdetail getCustomer(int customerid) {
		// TODO Auto-generated method stub
		return dao.getCustomer(customerid);
	}
	
	
}
