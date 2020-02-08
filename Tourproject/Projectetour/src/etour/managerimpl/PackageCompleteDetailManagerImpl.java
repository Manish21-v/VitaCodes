package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.PackageCompleteDetailDAO;
import etour.manager.PackageCompleteDetailManager;
import etour.pojo.Packagecompletedetail;

@Service
public class PackageCompleteDetailManagerImpl implements PackageCompleteDetailManager {

	@Autowired
	PackageCompleteDetailDAO dao;
	
	@Override
	public void addPackage(Packagecompletedetail packagedetail) {
		dao.addPackage(packagedetail);
	}

	@Override
	public List<Packagecompletedetail> getPackage() {
		return dao.getPackage();
	}

	@Override
	public void deletePackage(int id) {
		dao.deletePackage(id);
	}

	@Override
	public void updatePackage(Packagecompletedetail packagedetail, int id) {
		dao.updatePackage(packagedetail, id);
	}

	@Override
	public Packagecompletedetail getPackage(int id) {
		return dao.getPackage(id);
	}

}
