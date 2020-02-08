package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.manager.DatePackageDetailManager;
import etour.pojo.Datepackagedetail;
import etour.dao.DatepackagedetailDAO;;


@Service
public class DatePackageDetailManagerImpl implements DatePackageDetailManager
{
	@Autowired
	DatepackagedetailDAO dao;
	
	@Override
	public void addDatepackagedetail(Datepackagedetail d) {
		// TODO Auto-generated method stub
		dao.addDatepackagedetail(d);
		
	}

	@Override
	public List<Datepackagedetail> getDatepackagedetail() {
		// TODO Auto-generated method stub
		return dao.getDatepackagedetail();
	}

	@Override
	public void delete(int datepackageid) {
		// TODO Auto-generated method stub
		dao.delete(datepackageid);
		
	}

	@Override
	public Datepackagedetail getDatepackagepackagedetail(int datepackageid) {
		// TODO Auto-generated method stub
		return dao.getDatepackagepackagedetail(datepackageid);
	}

	@Override
	public void update(Datepackagedetail d, int datepackageid) {
		// TODO Auto-generated method stub
		dao.update(d, datepackageid);
	}

}
