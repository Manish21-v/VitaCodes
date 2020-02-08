package etour.manager;

import java.util.List;

import etour.pojo.Datepackagedetail;

public interface DatePackageDetailManager
{
	void addDatepackagedetail(Datepackagedetail d);
	List<Datepackagedetail> getDatepackagedetail();
	void delete(int datepackageid);
	Datepackagedetail getDatepackagepackagedetail(int datepackageid);
	void update(Datepackagedetail d,int datepackageid);
}
