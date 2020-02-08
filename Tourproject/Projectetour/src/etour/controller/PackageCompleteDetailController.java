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

import etour.manager.PackageCompleteDetailManager;
import etour.pojo.Packagecompletedetail;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class PackageCompleteDetailController {

	@Autowired
	PackageCompleteDetailManager manager;
	
	@GetMapping(value = "package/search", headers = "Accept=application/json")
	public String showPackage(){
		return new Gson().toJson(manager.getPackage());
	}
	
	@GetMapping(value = "package/search/{id}", headers = "Accept=application/json")
	public Packagecompletedetail getPackage(@PathVariable int id) {
		return manager.getPackage(id);
	}
	
	@PostMapping(value = "package/add", headers = "Accept=application/json")
	public void addPackage(@RequestBody Packagecompletedetail packagedetail) {
		manager.addPackage(packagedetail);
	}
	
	@PutMapping(value = "package/update/{id}", headers = "Accept=appllication/json")
	public void updatePackage(@RequestBody Packagecompletedetail packagedetail, @PathVariable int id) {
		manager.updatePackage(packagedetail, id);
	}
	
	@DeleteMapping(value = "package/delete/{id}", headers = "Accpet=application/json")
	public void deletePackage(@PathVariable int id) {
		manager.deletePackage(id);
	}
	
}
