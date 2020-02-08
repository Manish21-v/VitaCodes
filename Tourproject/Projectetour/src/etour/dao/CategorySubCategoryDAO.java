package etour.dao;

import java.util.List;

import etour.pojo.Categorysubcategory;


public interface CategorySubCategoryDAO

{
	void addCategorySubCategory(Categorysubcategory c);
	List<Categorysubcategory> getCategorysubcategory();
	void delete (int catsubid);
	void update (Categorysubcategory cobj,int catsubid);
	Categorysubcategory getCategorysubcategory(int catsubid);
	
}
