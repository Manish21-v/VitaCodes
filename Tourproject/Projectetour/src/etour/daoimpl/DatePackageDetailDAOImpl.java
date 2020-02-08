package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.DatepackagedetailDAO;
import etour.pojo.Datepackagedetail;

@Repository
@Transactional
public class DatePackageDetailDAOImpl implements DatepackagedetailDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addDatepackagedetail(Datepackagedetail d) {
		// TODO Auto-generated method stub
		template.save(d);
	}

	@Override
	public List<Datepackagedetail> getDatepackagedetail() {
		// TODO Auto-generated method stub
		List<Datepackagedetail>mylist=(List<Datepackagedetail>) template.find("from Datepackagedetail");
		return mylist;
		
	}

	@Override
	public void delete(int datepackageid) {
		// TODO Auto-generated method stub
		template.delete(template.get(Datepackagedetail.class, datepackageid));
	}

	@Override
	public Datepackagedetail getDatepackagepackagedetail(int datepackageid) {
		// TODO Auto-generated method stub
		Datepackagedetail dobj=(Datepackagedetail) template.find("from Datepackagedetail d where d.datepackageid=?", datepackageid);
		return dobj;
	}
	

	@Override
	public void update(Datepackagedetail d, int datepackageid)
	{
		// TODO Auto-generated method stub
		template.bulkUpdate("upadte Datepackagedetail d set d.startdate=?,d.enddate=?,d.packageid=?,d.reversestripflag=?",
				d.getStartdate(),d.getEnddate(),d.getPackagecompletedetail().getPackageid(),d.getReversetripflag(),datepackageid);
		
	}

}
