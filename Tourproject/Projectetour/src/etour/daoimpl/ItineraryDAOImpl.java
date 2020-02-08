package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.ItineraryDAO;
import etour.pojo.Itinerary;

@Repository
@Transactional
public class ItineraryDAOImpl implements ItineraryDAO 
{
	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addItinerary(Itinerary c) {
		// TODO Auto-generated method stub
		template.save(c);
	}

	@Override
	public List<Itinerary> getItinerary() {
		// TODO Auto-generated method stub
		List<Itinerary> mylist=(List<Itinerary>) template.find("from Itinerary c");
		return mylist;
	}

	@Override
	public void deleteItinerary(int itrId) {
		// TODO Auto-generated method stub
		template.delete(template.get(Itinerary.class, itrId));
	}

	@Override
	public void updateItinerary(Itinerary itinerary, int itrId) {
		// TODO Auto-generated method stub
		template.bulkUpdate("update Itinerary set packagecompletedetail=?,location=?,dayno=?,daywisedescription=? where itrId=?",
				itinerary.getPackagecompletedetail(),itinerary.getLocation(),itinerary.getDayno(),itinerary.getDaywisedescription(),itrId);
		
	}

	@Override
	public Itinerary getItinerary(int itrId) {
		// TODO Auto-generated method stub
		Itinerary cobj=(Itinerary) template.find("from Itinerary c where c.itrId=?",itrId).get(0);
		return cobj;
		
	}

}
