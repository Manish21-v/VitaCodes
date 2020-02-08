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

import etour.manager.PricedetailManager;
import etour.pojo.Pricedetail;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class PriceDetailController {
	
	@Autowired
	PricedetailManager manager;
	
	@GetMapping(value = "pricedetail/search",headers = "Accept=application/json")
	public String showPricedetails()
	{
		return new Gson().toJson(manager.getPricedetail());
	}
	@GetMapping(value = "pricedetail/search/{pid}", headers = "Accept=application/json")  
	 public Pricedetail getPricedetail(@PathVariable int pid)
	 {
		Pricedetail pobj=manager.getPricedetail(pid);
		return pobj;
	 }
	@DeleteMapping(value = "pricedetail/delete/{pid}", headers = "Accept=application/json")  
	 public void removePricedetail(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "pricedetail/update/{pid}",headers = "Accept=application/json")  
	 public void updatePricedetail(@RequestBody Pricedetail price,@PathVariable int pid)
	 {
		manager.update(price,pid);
	 }
	@PostMapping(value = "pricedetail/add", headers = "Accept=application/json")  
	 public void add(@RequestBody Pricedetail price)
	 {
		System.out.println("addpro called");
		manager.addPricedetail(price);
	 }

}
