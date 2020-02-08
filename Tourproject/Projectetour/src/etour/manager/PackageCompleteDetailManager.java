package etour.manager;

import java.util.List;

import etour.pojo.Packagecompletedetail;

public interface PackageCompleteDetailManager {
	void addPackage(Packagecompletedetail packagedetail);
	List<Packagecompletedetail> getPackage();
	void deletePackage (int id);
	void updatePackage( Packagecompletedetail packagedetail, int id);
	Packagecompletedetail getPackage(int id);	
}
