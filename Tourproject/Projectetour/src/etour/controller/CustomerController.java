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
import etour.pojo.Customerdetail;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class CustomerController
{
	@Autowired
	CustomerManager manager;
	
	@GetMapping(value = "customer/search",headers = "Accept=application/json")
	 public String showCustomers()
	 {
		  return new Gson().toJson(manager.getCustomers());
	 }
	@GetMapping(value = "customer/search/{pid}", headers = "Accept=application/json")  
	 public Customerdetail getCutsomer(@PathVariable int pid)
	 {
		Customerdetail cobj=manager.getCustomer(pid);
		return cobj;
	 }
	@DeleteMapping(value = "customer/delete/{pid}", headers = "Accept=application/json")  
	 public void removeCustomer(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "customer/update/{pid}",headers = "Accept=application/json")  
	 public void updateCustomer(@RequestBody Customerdetail customer,@PathVariable int pid)
	 {
		manager.update(customer,pid);
	 }
	@PostMapping(value = "customer/add", headers = "Accept=application/json")  
	 public void addCustomer(@RequestBody Customerdetail customer)
	 {
		System.out.println("addpro called");
		manager.addCustomer(customer);
	 }

}
