package etour.dao;

import java.util.List;


import etour.pojo.Pricedetail;

public interface PricedetailDAO {

	void addPricedetail(Pricedetail p);
	List<Pricedetail> getPricedetail();
	void delete (int id);
	void update( Pricedetail price, int priceid);
	Pricedetail getPricedetail(int priceid);
}
