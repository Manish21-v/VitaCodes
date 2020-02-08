package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import etour.manager.CategorySubCategoryManager;
import etour.pojo.Categorysubcategory;
import etour.dao.CategorySubCategoryDAO;

@Service
public class CategorySubCategoryManagerImpl implements CategorySubCategoryManager
{
	@Autowired
	CategorySubCategoryDAO dao;

	@Override
	public void addCategorySubCategory(Categorysubcategory c) {
		// TODO Auto-generated method stub
		dao.addCategorySubCategory(c);
	}

	@Override
	public List<Categorysubcategory> getCategorysubcategory() {
		// TODO Auto-generated method stub
		return dao.getCategorysubcategory();
	}

	@Override
	public void delete(int catsubid) {
		// TODO Auto-generated method stub
		dao.delete(catsubid);
		
	}

	@Override
	public void update(Categorysubcategory cobj, int catsubid) {
		// TODO Auto-generated method stub
		dao.update(cobj, catsubid);
	}

	@Override
	public Categorysubcategory getCategorysubcategory(int catsubid) {
		// TODO Auto-generated method stub
		return dao.getCategorysubcategory(catsubid);
	}

}
