package etour.pojo;
// Generated 21 Jan, 2020 1:04:08 PM by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Passengerdetail generated by hbm2java
 */
@Entity
@Table(name = "passengerdetail", catalog = "etour")
public class Passengerdetail implements java.io.Serializable {

	private Integer passengerid;
	private Bookingdetail bookingdetail;
	private String passengername;
	private Date passengerdob; 
	private String roomtype;
	private BigDecimal cost;
	private String passengeriddocument;
	private Integer passengeridno;
	private String passengerdetailcol;
	private String passengersex;
	private String passengeremail;
	private Set<Bookingdetail> bookingdetails = new HashSet<Bookingdetail>(0);

	public Passengerdetail() {
	}

	public Passengerdetail(Bookingdetail bookingdetail, String passengername, Date passengerdob, String roomtype,
			BigDecimal cost, String passengeriddocument, Integer passengeridno, String passengerdetailcol,
			String passengersex, String passengeremail, Set<Bookingdetail> bookingdetails) {
		this.bookingdetail = bookingdetail;
		this.passengername = passengername;
		this.passengerdob = passengerdob;
		this.roomtype = roomtype;
		this.cost = cost;
		this.passengeriddocument = passengeriddocument;
		this.passengeridno = passengeridno;
		this.passengerdetailcol = passengerdetailcol;
		this.passengersex = passengersex;
		this.passengeremail = passengeremail;
		this.bookingdetails = bookingdetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "passengerid", unique = true, nullable = false)
	public Integer getPassengerid() {
		return this.passengerid;
	}

	public void setPassengerid(Integer passengerid) {
		this.passengerid = passengerid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bookingid")
	public Bookingdetail getBookingdetail() {
		return this.bookingdetail;
	}

	public void setBookingdetail(Bookingdetail bookingdetail) {
		this.bookingdetail = bookingdetail;
	}

	@Column(name = "passengername", length = 50)
	public String getPassengername() {
		return this.passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "passengerdob", length = 10)
	public Date getPassengerdob() {
		return this.passengerdob;
	}

	public void setPassengerdob(Date passengerdob) {
		this.passengerdob = passengerdob;
	}

	@Column(name = "roomtype", length = 20)
	public String getRoomtype() {
		return this.roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	@Column(name = "cost", precision = 10, scale = 3)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Column(name = "passengeriddocument", length = 45)
	public String getPassengeriddocument() {
		return this.passengeriddocument;
	}

	public void setPassengeriddocument(String passengeriddocument) {
		this.passengeriddocument = passengeriddocument;
	}

	@Column(name = "passengeridno")
	public Integer getPassengeridno() {
		return this.passengeridno;
	}

	public void setPassengeridno(Integer passengeridno) {
		this.passengeridno = passengeridno;
	}

	@Column(name = "passengerdetailcol", length = 45)
	public String getPassengerdetailcol() {
		return this.passengerdetailcol;
	}

	public void setPassengerdetailcol(String passengerdetailcol) {
		this.passengerdetailcol = passengerdetailcol;
	}

	@Column(name = "passengersex", length = 10)
	public String getPassengersex() {
		return this.passengersex;
	}

	public void setPassengersex(String passengersex) {
		this.passengersex = passengersex;
	}

	@Column(name = "passengeremail", length = 30)
	public String getPassengeremail() {
		return this.passengeremail;
	}

	public void setPassengeremail(String passengeremail) {
		this.passengeremail = passengeremail;
	}

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "passengerdetail")
	public Set<Bookingdetail> getBookingdetails() {
		return this.bookingdetails;
	}

	public void setBookingdetails(Set<Bookingdetail> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}*/

}
