package etour.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etour.dao.PassengerDetailDao;
import etour.manager.PassengerManager;
import etour.pojo.Passengerdetail;

@Service
public class PassengerManagerImpl implements PassengerManager{

	@Autowired
	PassengerDetailDao dao;
	
	@Override
	public List<Passengerdetail> getPassenger()
	{
		return dao.getPassenger();	
	}
	
	@Override
	public void addPassenger(Passengerdetail passenger)
	{
		dao.addPassenger(passenger);
	}
	
	@Override
	public void deletePassenger(int passengerid)
	{
		dao.deletePassenger(passengerid);
	}
	
	@Override
	public void updatePassenger(Passengerdetail passenger,int passengerid)
	{
		dao.updatePassenger(passenger, passengerid);
	}
	
	@Override
	public Passengerdetail getPassenger(int passengerid)
	{
		return dao.getPassenger(passengerid);
		
	}
}
