package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.CategorySubCategoryDAO;
import etour.pojo.Categorysubcategory;



@Repository
@Transactional
public class CategorySubCategoryDAOImpl implements CategorySubCategoryDAO 
{
	@Autowired
	HibernateTemplate template;

	@Override
	public void addCategorySubCategory(Categorysubcategory c) {
		// TODO Auto-generated method stub
		template.save(c);
		
	}

	@Override
	public List<Categorysubcategory> getCategorysubcategory() {
		
		// TODO Auto-generated method stub
		List <Categorysubcategory>mylist=(List<Categorysubcategory>) template.find("from Categorysubcategory c");
		return mylist;
	}

	@Override
	public void delete(int catsubid) {
		// TODO Auto-generated method stub
		template.delete(template.get(Categorysubcategory.class, catsubid));
		
	}

	@Override
	public void update(Categorysubcategory cobj, int catsubid) {
		// TODO Auto-generated method stub
		template.bulkUpdate("upadte from Categorysubcategory c set categoryid=?,categoryname=?,categoryimage=?,subcategoryid=?,subcategoryname=?,subcategoryimage=?,eofflag=?",
				cobj.getCategoryid(),cobj.getCategoryname(),cobj.getCategoryimage(),cobj.getSubcategoryid(),cobj.getSubcategoryname(),cobj.getSubcategoryimage(),cobj.getEofflag(),catsubid);
	}

	@Override
	public Categorysubcategory getCategorysubcategory(int catsubid) {
		// TODO Auto-generated method stub
		Categorysubcategory cobj=(Categorysubcategory) template.find("from Categorysubcategory c where c.catsubid=? ",catsubid).get(0);
		return cobj;
	}
	
}
