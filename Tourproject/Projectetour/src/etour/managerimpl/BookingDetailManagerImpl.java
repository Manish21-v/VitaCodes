package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.BookingDetailDAO;
import etour.manager.BookingDetailManager;
import etour.pojo.Bookingdetail;

@Service
public class BookingDetailManagerImpl implements BookingDetailManager {

	@Autowired
	BookingDetailDAO dao;
	
	@Override
	public void addBooking(Bookingdetail c) {
		dao.addBooking(c);

	}

	@Override
	public List<Bookingdetail> getBooking() {
		List<Bookingdetail> temp = dao.getBooking();
		return temp;
	}

	@Override
	public void deleteBooking(int id) {
		dao.deleteBooking(id);

	}

	@Override
	public void updateBooking(Bookingdetail bookingdetail, int id) {
		dao.updateBooking(bookingdetail, id);

	}

	@Override
	public Bookingdetail getBooking(int id) {
		Bookingdetail bookingdetail = dao.getBooking(id);
		return bookingdetail;
	}

}
