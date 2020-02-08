package etour.pojo;
// Generated 21 Jan, 2020 1:04:08 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Itinerary generated by hbm2java
 */
@Entity
@Table(name = "itinerary", catalog = "etour")
public class Itinerary implements java.io.Serializable {

	private Integer itrId;
	private Packagecompletedetail packagecompletedetail;
	private String location;
	private Integer dayno;
	private String daywisedescription;

	public Itinerary() {
	}

	public Itinerary(Packagecompletedetail packagecompletedetail, String location, Integer dayno,
			String daywisedescription) {
		this.packagecompletedetail = packagecompletedetail;
		this.location = location;
		this.dayno = dayno;
		this.daywisedescription = daywisedescription;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "itr_id", unique = true, nullable = false)
	public Integer getItrId() {
		return this.itrId;
	}

	public void setItrId(Integer itrId) {
		this.itrId = itrId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "packageid")
	public Packagecompletedetail getPackagecompletedetail() {
		return this.packagecompletedetail;
	}

	public void setPackagecompletedetail(Packagecompletedetail packagecompletedetail) {
		this.packagecompletedetail = packagecompletedetail;
	}

	@Column(name = "location", length = 30)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "dayno")
	public Integer getDayno() {
		return this.dayno;
	}

	public void setDayno(Integer dayno) {
		this.dayno = dayno;
	}

	@Column(name = "daywisedescription")
	public String getDaywisedescription() {
		return this.daywisedescription;
	}

	public void setDaywisedescription(String daywisedescription) {
		this.daywisedescription = daywisedescription;
	}

}
