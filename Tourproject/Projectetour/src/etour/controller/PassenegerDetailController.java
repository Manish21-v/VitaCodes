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

import etour.manager.PassengerManager;
import etour.pojo.Passengerdetail;

@RestController  
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class PassenegerDetailController {

	@Autowired
	PassengerManager manager;
	
	@GetMapping(value = "passenger/search",headers = "Accept=application/json")  
	 public String showPassenger()
	 {
		  return new Gson().toJson(manager.getPassenger());
	 }
	
	@GetMapping(value = "passenger/search/{id}", headers = "Accept=application/json")
	public Passengerdetail getPassenger(@PathVariable int id) {
		Passengerdetail temp = manager.getPassenger(id);
		return temp;
	}
	
	@PostMapping(value = "passenger/add", headers="Accept=application/json")
	public void addPassenger(@RequestBody Passengerdetail passengerdetail) {
		manager.addPassenger(passengerdetail);
	}
	
	@PutMapping(value = "passenger/update", headers="Accept=application/json")
	public void updatePassenger(@RequestBody Passengerdetail passengerdetail, @PathVariable int id) {
		manager.updatePassenger(passengerdetail, id);
	}
	
	@DeleteMapping(value = "passenger/delete", headers="Accept=applicaiton/json")
	public void deletePassenger(@PathVariable int id) {
		manager.deletePassenger(id);
	}
}
