package etour.manager;

import java.util.List;

import etour.pojo.Pricedetail;


public interface PricedetailManager {
	void addPricedetail(Pricedetail p);
	List<Pricedetail> getPricedetail();
	void delete (int id);
	void update( Pricedetail price, int priceid);
	Pricedetail getPricedetail(int priceid);

}
