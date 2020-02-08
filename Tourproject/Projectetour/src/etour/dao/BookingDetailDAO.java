package etour.dao;

import java.util.List;

import etour.pojo.Bookingdetail;


public interface BookingDetailDAO {
	void addBooking(Bookingdetail c);
	List<Bookingdetail> getBooking();
	void deleteBooking(int id);
	void updateBooking(Bookingdetail bookingdetail, int id);
	Bookingdetail getBooking(int id);	
}
