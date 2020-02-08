package etour.dao;

import java.util.List;

import etour.pojo.Passengerdetail;

public interface PassengerDetailDao {

	void addPassenger(Passengerdetail passenger);
	List<Passengerdetail>getPassenger();
	void deletePassenger(int passengerid);
	void updatePassenger(Passengerdetail passenger,int passengerid);
	Passengerdetail getPassenger(int passengerid);
}
