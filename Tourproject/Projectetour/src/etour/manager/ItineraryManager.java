package etour.manager;

import java.util.List;

import etour.pojo.Itinerary;

public interface ItineraryManager
{
	void addItinerary(Itinerary c);
	List<Itinerary> getItinerary();
	void deleteItinerary (int itrId);
	void updateItinerary( Itinerary itinerary, int itrId);
	Itinerary getItinerary(int itrId);
	
}
