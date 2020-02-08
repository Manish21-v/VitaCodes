package etour.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import etour.dao.PassengerDetailDao;
import etour.pojo.Passengerdetail;


@Repository
@Transactional
public class PassenegerDetailDaoImpl implements PassengerDetailDao {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public List<Passengerdetail> getPassenger()
	{
		List<Passengerdetail>mylist=(List<Passengerdetail>)template.find("from Passengerdetail p");
		return mylist;
	}
	
	@Override
	public void addPassenger(Passengerdetail passenger)
	{
		template.save(passenger);
	}
	
	@Override
	public void deletePassenger(int passengerid)
	{
		template.delete(template.get(Passengerdetail.class, passengerid));
	}
	
	@Override
	public void updatePassenger(Passengerdetail passenger,int passengerid)
	{
		
		template.bulkUpdate("update Passengerdetail p set p.passengername=?,p.passengerdob=?,p.roomtype=?,p.cost=?,p.passengeriddocument=?,p.passengeridno=?,p.passengerdetailcol=?,p.passengersex=?,p.passengeremail=? where p.passengerid=?", new Object[] {passenger.getPassengername(),passenger.getPassengerdob(),passenger.getRoomtype()
				,passenger.getCost(),passenger.getPassengeriddocument(),passenger.getPassengeridno(),
				passenger.getPassengerdetailcol(),passenger.getPassengersex(),passenger.getPassengeremail(),passengerid});
		
	}
	
	@Override
	public Passengerdetail getPassenger(int passengerid)
	{
		Passengerdetail detail=(Passengerdetail)template.find("from Passengerdetail p where p.id=?",passengerid).get(0);
		return detail;
	}

}
