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

import etour.manager.CustomerManager;
import etour.manager.DatePackageDetailManager;
import etour.pojo.Customerdetail;
import etour.pojo.Datepackagedetail;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class DatePackageDetailController
{
	
	@Autowired
	DatePackageDetailManager manager;
	
	@GetMapping(value = "date/search",headers = "Accept=application/json")
	 public String showDatepackagedetail()
	 {
		  return new Gson().toJson(manager.getDatepackagedetail());
	 }
	@GetMapping(value = "date/search/{pid}", headers = "Accept=application/json")  
	 public Datepackagedetail getDatepackagedetail(@PathVariable int pid)
	 {
		Datepackagedetail dobj=manager.getDatepackagepackagedetail(pid);
		return dobj;
	 }
	@DeleteMapping(value = "date/delete/{pid}", headers = "Accept=application/json")  
	 public void removeDatePackagedetail(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "date/update/{pid}",headers = "Accept=application/json")  
	 public void updateDatepackagedetail(@RequestBody Datepackagedetail date,@PathVariable int pid)
	 {
		manager.update(date,pid);
	 }
	@PostMapping(value = "date/add", headers = "Accept=application/json")  
	 public void addDatepackagedetail(@RequestBody Datepackagedetail date)
	 {
		System.out.println("addpro called");
		manager.addDatepackagedetail(date);
	 }

}
