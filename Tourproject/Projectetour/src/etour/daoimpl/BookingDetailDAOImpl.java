package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.BookingDetailDAO;
import etour.pojo.Bookingdetail;

@Repository
@Transactional
public class BookingDetailDAOImpl implements BookingDetailDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addBooking(Bookingdetail bookingdetail) {
		template.save(bookingdetail);

	}

	@Override
	public List<Bookingdetail> getBooking() {
		List<Bookingdetail> temp = (List<Bookingdetail>) template.find("from Bookingdetail");
		return temp;
	}

	@Override
	public void deleteBooking(int id) {
		template.delete(id);

	}

	@Override
	public void updateBooking(Bookingdetail bookingdetail, int id) {
		template.bulkUpdate("update Bookingdetail set datepackageid=?, bookingdate=?, customerdate=?, packageid=?, passengerid=?, activestatus=?", bookingdetail.getDatepackagedetail(),bookingdetail.getBookingid(), bookingdetail.getCustomerdetail(),bookingdetail.getPackagecompletedetail(), bookingdetail.getPassengerdetail(), bookingdetail.getActivestatus());

	}

	@Override
	public Bookingdetail getBooking(int id) {
		Bookingdetail bookingdetail = (Bookingdetail) template.find("from Bookingdetail where bookingid=?", id);
		return bookingdetail;
	}

}
