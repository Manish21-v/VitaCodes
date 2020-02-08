package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.PricedetailDAO;
import etour.manager.PricedetailManager;
import etour.pojo.Pricedetail;

@Service
public class PricedetailManagerImpl implements PricedetailManager {
	@Autowired
	PricedetailDAO dao;

	@Override
	public void addPricedetail(Pricedetail p) {
		// TODO Auto-generated method stub
		dao.addPricedetail(p);
	}

	@Override
	public List<Pricedetail> getPricedetail() {
		// TODO Auto-generated method stub
		return dao.getPricedetail();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 dao.delete(id);
	}

	@Override
	public void update(Pricedetail price, int priceid) {
		// TODO Auto-generated method stub
		dao.update(price, priceid);
	}

	@Override
	public Pricedetail getPricedetail(int priceid) {
		// TODO Auto-generated method stub
		return dao.getPricedetail(priceid);
	}

}
