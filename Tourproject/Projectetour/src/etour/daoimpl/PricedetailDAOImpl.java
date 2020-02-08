package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.PricedetailDAO;
import etour.pojo.Pricedetail;
 
@Repository
@Transactional
public class PricedetailDAOImpl implements PricedetailDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addPricedetail(Pricedetail p) {
		// TODO Auto-generated method stub
		template.save(p);
	}

	@Override
	public List<Pricedetail> getPricedetail() {
		// TODO Auto-generated method stub
		List<Pricedetail> mylist=(List<Pricedetail>) template.find("from Pricedetail p");
		return mylist;
	}

	@Override
	public void delete(int priceid) {
		// TODO Auto-generated method stub
		template.delete(template.get(Pricedetail.class, priceid));
	}

	@Override
	public void update(Pricedetail price, int id) {
		// TODO Auto-generated method stub
		//template.bulkUpdate("update Pricedetail set packagecompletedetail=?,adultprice=?,childrenprice=?,additionalcharges=?",
			//	price.getPackagecompletedetail(),price.getAdultprice(),price.getChildrenprice(),price.getAdditionalcharges());
	}

	@Override
	public Pricedetail getPricedetail(int priceid) {
		// TODO Auto-generated method stub
		Pricedetail pobj=(Pricedetail) template.find("from Pricedetail p where p.id=?",priceid).get(0);
		return pobj;
		
	}


}
