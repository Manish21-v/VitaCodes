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


import etour.manager.ItineraryManager;
import etour.pojo.Itinerary;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")

public class ItineraryController
{
	@Autowired
	ItineraryManager manager;
	
	@GetMapping(value = "itinerary/search",headers = "Accept=application/json")
	 public String showItinerary()
	 {
		  return new Gson().toJson(manager.getItinerary());
	 }
	@GetMapping(value = "itinerary/search/{pid}", headers = "Accept=application/json")  
	 public Itinerary getItinerary(@PathVariable int pid)
	 {
		Itinerary cobj=manager.getItinerary(pid);
		return cobj;
	 }
	@DeleteMapping(value = "itinerary/delete/{pid}", headers = "Accept=application/json")  
	 public void removeItinerary(@PathVariable int pid)
	 {
		manager.deleteItinerary(pid);
	 }
	@PutMapping(value = "itinerary/update/{pid}",headers = "Accept=application/json")  
	 public void updateItinerary(@RequestBody Itinerary itinerary,@PathVariable int pid)
	 {
		manager.updateItinerary(itinerary,pid);
	 }
	@PostMapping(value = "itinerary/add", headers = "Accept=application/json")  
	 public void Itinerary(@RequestBody Itinerary itinerary)
	 {
		System.out.println("addpro called");
		manager.addItinerary(itinerary);
	 }

}
