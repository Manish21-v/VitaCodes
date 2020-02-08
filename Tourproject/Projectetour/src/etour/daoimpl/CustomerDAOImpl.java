package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.CustomerDAO;
import etour.pojo.Customerdetail;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addCustomer(Customerdetail c) {
		// TODO Auto-generated method stub
		template.save(c);
	}

	@Override
	public List<Customerdetail> getCustomers() {
		// TODO Auto-generated method stub
		List<Customerdetail> mylist=(List<Customerdetail>) template.find("from Customerdetail c");
		return mylist;
	}

	@Override
	public void delete(int customerid) {
		// TODO Auto-generated method stub
		template.delete(template.get(Customerdetail.class, customerid));
	}

	@Override
	public void update(Customerdetail customer, int customerid) {
		// TODO Auto-generated method stub
		template.bulkUpdate("update Customerdetail set customername=?,email=?,password=?,address1=?,address2=?,city=?,state=?,pin=?,telno=?,mobileno=?,registrationdate=? where customerid=?",
				customer.getCustomername(),customer.getEmail(),customer.getPassword(),customer.getAddress1(),customer.getAddress2(),customer.getCity(),customer.getState(),
				customer.getPin(),customer.getTelno(),customer.getMobileno(),customer.getRegistrationdate(),customerid);
		
	}

	@Override
	public Customerdetail getCustomer(int customerid) {
		// TODO Auto-generated method stub
		Customerdetail cobj=(Customerdetail) template.find("from Customerdetail c where c.customerid=?",customerid).get(0);
		return cobj;
		
	}

}
