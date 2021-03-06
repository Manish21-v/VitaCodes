package etour.pojo;
// Generated 21 Jan, 2020 1:04:08 PM by Hibernate Tools 3.2.2.GA

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
 * Datepackagedetail generated by hbm2java
 */
@Entity
@Table(name = "datepackagedetail", catalog = "etour")
public class Datepackagedetail implements java.io.Serializable {

	public Datepackagedetail(Integer datepackageid, Packagecompletedetail packagecompletedetail, Date startdate,
			Date enddate, String reversetripflag) {
		super();
		this.datepackageid = datepackageid;
		this.packagecompletedetail = packagecompletedetail;
		this.startdate = startdate;
		this.enddate = enddate;
		this.reversetripflag = reversetripflag;
	}

	private Integer datepackageid;
	private Packagecompletedetail packagecompletedetail;
	private Date startdate;
	private Date enddate;
	private String reversetripflag;
	//private Set<Bookingdetail> bookingdetails = new HashSet<Bookingdetail>(0);

	public Datepackagedetail() {
	}

	public Datepackagedetail(Date startdate, Date enddate) {
		this.startdate = startdate;
		this.enddate = enddate;
	}
	
	

	/*public Datepackagedetail(Packagecompletedetail packagecompletedetail, Date startdate, Date enddate,
			String reversetripflag, Set<Bookingdetail> bookingdetails) {
		this.packagecompletedetail = packagecompletedetail;
		this.startdate = startdate;
		this.enddate = enddate;
		this.reversetripflag = reversetripflag;
		this.bookingdetails = bookingdetails;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "datepackageid", unique = true, nullable = false)
	public Integer getDatepackageid() {
		return this.datepackageid;
	}

	public void setDatepackageid(Integer datepackageid) {
		this.datepackageid = datepackageid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "packageid")
	public Packagecompletedetail getPackagecompletedetail() {
		return this.packagecompletedetail;
	}

	public void setPackagecompletedetail(Packagecompletedetail packagecompletedetail) {
		this.packagecompletedetail = packagecompletedetail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "startdate", nullable = false, length = 10)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "enddate", nullable = false, length = 10)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "reversetripflag", length = 5)
	public String getReversetripflag() {
		return this.reversetripflag;
	}

	public void setReversetripflag(String reversetripflag) {
		this.reversetripflag = reversetripflag;
	}

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "datepackagedetail")
	public Set<Bookingdetail> getBookingdetails() {
		return this.bookingdetails;
	}

	public void setBookingdetails(Set<Bookingdetail> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}*/

}
