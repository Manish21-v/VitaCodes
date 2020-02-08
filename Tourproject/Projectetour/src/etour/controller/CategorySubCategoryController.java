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
import etour.manager.CategorySubCategoryManager;
import etour.pojo.Categorysubcategory;


@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class CategorySubCategoryController
{
	@Autowired
	CategorySubCategoryManager manager;
	
	
	@GetMapping(value = "category/search",headers = "Accept=application/json")
	 public String showCategory()
	 {
		  return new Gson().toJson(manager.getCategorysubcategory());
	 }
	@GetMapping(value = "category/search/{pid}", headers = "Accept=application/json")  
	 public Categorysubcategory getCategory(@PathVariable int pid)
	 {
		Categorysubcategory cobj=manager.getCategorysubcategory(pid);
		return cobj;
	 }
	@DeleteMapping(value = "category/delete/{pid}", headers = "Accept=application/json")  
	 public void removeCategory(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	@PutMapping(value = "category/update/{pid}",headers = "Accept=application/json")  
	 public void updateCategory(@RequestBody Categorysubcategory category,@PathVariable int pid)
	 {
		manager.update(category,pid);
	 }
	@PostMapping(value = "category/add", headers = "Accept=application/json")  
	 public void add(@RequestBody Categorysubcategory category)
	 {
		System.out.println("addpro called");
		manager.addCategorySubCategory(category);
	 }

}
