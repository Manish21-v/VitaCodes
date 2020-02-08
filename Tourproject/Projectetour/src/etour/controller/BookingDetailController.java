package etour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import etour.manager.BookingDetailManager;
import etour.pojo.Bookingdetail;

@RestController  
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class BookingDetailController {
	
	@Autowired
	BookingDetailManager manager;
	
	@GetMapping(value = "booking/search", headers = "Accept=application/json")
	public String showBooking() {
		return new Gson().toJson(manager.getBooking());
	}
	
	@GetMapping(value = "booking/search/{id}", headers = "Accept=application/json")
	public Bookingdetail getBooking(@PathVariable int id) {
		Bookingdetail bookingdetail = manager.getBooking(id);
		return bookingdetail;
	}
	
	@PostMapping(value = "booking/add", headers = "Accept=application/json")
	public void addBooking(@RequestBody Bookingdetail bookingdetail) {
		manager.addBooking(bookingdetail);
	}
	
	@PutMapping(value = "booking/update", headers = "Accept/application")
	public void updateBooking(@RequestBody Bookingdetail bookingdetail, @PathVariable int id) {
		manager.updateBooking(bookingdetail, id);
	}
	
	@DeleteMapping(value = "booking/delete", headers = "Accept=application/json")
	public void deleteBooking(@PathVariable int id) {
		manager.deleteBooking(id);
	}

}
