package etour.pojo;
// Generated 21 Jan, 2020 1:04:08 PM by Hibernate Tools 3.2.2.GA

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

/**
 * Packagecompletedetail generated by hbm2java
 */
@Entity
@Table(name = "packagecompletedetail", catalog = "etour")
public class Packagecompletedetail implements java.io.Serializable {

	

	private Integer packageid;
	private Categorysubcategory categorysubcategory;
	private String tourname;
	private String tourimage;
	private String description;
	/*private Set<Pricedetail> pricedetails = new HashSet<Pricedetail>(0);
	private Set<Datepackagedetail> datepackagedetails = new HashSet<Datepackagedetail>(0);
	private Set<Itinerary> itineraries = new HashSet<Itinerary>(0);
	private Set<Bookingdetail> bookingdetails = new HashSet<Bookingdetail>(0);

*/	public Packagecompletedetail() {
	}

public Packagecompletedetail(Integer packageid, Categorysubcategory categorysubcategory, String tourname,
		String tourimage, String description) {
	super();
	this.packageid = packageid;
	this.categorysubcategory = categorysubcategory;
	this.tourname = tourname;
	this.tourimage = tourimage;
	this.description = description;
}

	/*public Packagecompletedetail(Categorysubcategory categorysubcategory, String tourname, String tourimage,
			String description, Set<Pricedetail> pricedetails, Set<Datepackagedetail> datepackagedetails,
			Set<Itinerary> itineraries, Set<Bookingdetail> bookingdetails) {
		this.categorysubcategory = categorysubcategory;
		this.tourname = tourname;
		this.tourimage = tourimage;
		this.description = description;
		this.pricedetails = pricedetails;
		this.datepackagedetails = datepackagedetails;
		this.itineraries = itineraries;
		this.bookingdetails = bookingdetails;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "packageid", unique = true, nullable = false)
	public Integer getPackageid() {
		return this.packageid;
	}

	public void setPackageid(Integer packageid) {
		this.packageid = packageid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "catsubid")
	public Categorysubcategory getCategorysubcategory() {
		return this.categorysubcategory;
	}

	public void setCategorysubcategory(Categorysubcategory categorysubcategory) {
		this.categorysubcategory = categorysubcategory;
	}

	@Column(name = "tourname", length = 45)
	public String getTourname() {
		return this.tourname;
	}

	public void setTourname(String tourname) {
		this.tourname = tourname;
	}

	@Column(name = "tourimage", length = 45)
	public String getTourimage() {
		return this.tourimage;
	}

	public void setTourimage(String tourimage) {
		this.tourimage = tourimage;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "packagecompletedetail")
	public Set<Pricedetail> getPricedetails() {
		return this.pricedetails;
	}

	public void setPricedetails(Set<Pricedetail> pricedetails) {
		this.pricedetails = pricedetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "packagecompletedetail")
	public Set<Datepackagedetail> getDatepackagedetails() {
		return this.datepackagedetails;
	}

	public void setDatepackagedetails(Set<Datepackagedetail> datepackagedetails) {
		this.datepackagedetails = datepackagedetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "packagecompletedetail")
	public Set<Itinerary> getItineraries() {
		return this.itineraries;
	}

	public void setItineraries(Set<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "packagecompletedetail")
	public Set<Bookingdetail> getBookingdetails() {
		return this.bookingdetails;
	}

	public void setBookingdetails(Set<Bookingdetail> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}*/

}
