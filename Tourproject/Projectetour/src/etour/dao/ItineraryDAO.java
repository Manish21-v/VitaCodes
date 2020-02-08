package etour.dao;

import java.util.List;

import etour.pojo.Itinerary;

public interface ItineraryDAO 
{
	void addItinerary(Itinerary c);
	List<Itinerary> getItinerary();
	void deleteItinerary (int itrId);
	void updateItinerary( Itinerary itenerary, int itrId);
	Itinerary getItinerary(int itrId);
}
