package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.PackageCompleteDetailDAO;
import etour.pojo.Packagecompletedetail;

@Repository
@Transactional
public class PackageCompleteDetailDAOImpl implements PackageCompleteDetailDAO {
	
	@Autowired
	HibernateTemplate template;

	@Override
	public void addPackage(Packagecompletedetail packagedetail) {
		template.save(packagedetail);

	}

	@Override
	public List<Packagecompletedetail> getPackage() {
		List<Packagecompletedetail> temp =(List<Packagecompletedetail>) template.find("from Packagecompletedetail p");
		return temp;
	}

	@Override
	public void deletePackage(int id) {
		template.delete(template.get(Packagecompletedetail.class, id));

	}

	@Override
	public void updatePackage(Packagecompletedetail packagedetail, int id) {
		template.bulkUpdate("update Packagecompletedetails set tourname=?, tourimage=?, description=?", packagedetail.getTourname(), packagedetail.getTourimage(),  packagedetail
				.getDescription());

	}

	@Override
	public Packagecompletedetail getPackage(int id) {
		Packagecompletedetail temp = (Packagecompletedetail) template.find("from Packagecompletedetail pcd where pcd.id=?", id).get(0);
		return temp;
	}


}
