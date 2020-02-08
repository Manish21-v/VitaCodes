package etour.manager;

import java.util.List;

import etour.pojo.Bookingdetail;

public interface BookingDetailManager {
	void addBooking(Bookingdetail c);
	List<Bookingdetail> getBooking();
	void deleteBooking(int id);
	void updateBooking(Bookingdetail bookingdetail, int id);
	Bookingdetail getBooking(int id);
}
