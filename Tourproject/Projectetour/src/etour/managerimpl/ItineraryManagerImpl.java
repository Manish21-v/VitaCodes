package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.ItineraryDAO;
import etour.manager.ItineraryManager;
import etour.pojo.Itinerary;
@Service

public class ItineraryManagerImpl implements ItineraryManager
{
	@Autowired
	ItineraryDAO dao;
		
		@Override
		public void addItinerary(Itinerary c) {
			// TODO Auto-generated method stub
			dao.addItinerary(c);
		}

		@Override
		public List<Itinerary> getItinerary() {
			// TODO Auto-generated method stub
			return dao.getItinerary();
		}

		@Override
		public void deleteItinerary(int itrId) {
			// TODO Auto-generated method stub
			dao.deleteItinerary(itrId);
		}

		@Override
		public void updateItinerary(Itinerary itinerary, int itrId) {
			// TODO Auto-generated method stub
			dao.updateItinerary(itinerary, itrId);
		}

		@Override
		public Itinerary getItinerary(int itrId) {
			// TODO Auto-generated method stub
			return dao.getItinerary(itrId);
		}
		

}
