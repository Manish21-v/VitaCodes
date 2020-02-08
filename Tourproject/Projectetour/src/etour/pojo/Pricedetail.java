package etour.pojo;
// Generated 21 Jan, 2020 1:04:08 PM by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Pricedetail generated by hbm2java
 */
@Entity
@Table(name = "pricedetail", catalog = "etour")
public class Pricedetail implements java.io.Serializable {

	private int priceid;
	private Packagecompletedetail packagecompletedetail;
	private BigDecimal tourCost;
	private BigDecimal singlePerson;
	private BigDecimal adults;
	private BigDecimal childWOBed;
	private BigDecimal childWithBed;

	public Pricedetail() {
	}

	public Pricedetail(int priceid) {
		this.priceid = priceid;
	}

	public Pricedetail(int priceid, Packagecompletedetail packagecompletedetail, BigDecimal tourCost,
			BigDecimal singlePerson, BigDecimal adults, BigDecimal childWOBed, BigDecimal childWithBed) {
		this.priceid = priceid;
		this.packagecompletedetail = packagecompletedetail;
		this.tourCost = tourCost;
		this.singlePerson = singlePerson;
		this.adults = adults;
		this.childWOBed = childWOBed;
		this.childWithBed = childWithBed;
	}

	@Id

	@Column(name = "priceid", unique = true, nullable = false)
	public int getPriceid() {
		return this.priceid;
	}

	public void setPriceid(int priceid) {
		this.priceid = priceid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "packageid")
	public Packagecompletedetail getPackagecompletedetail() {
		return this.packagecompletedetail;
	}

	public void setPackagecompletedetail(Packagecompletedetail packagecompletedetail) {
		this.packagecompletedetail = packagecompletedetail;
	}

	@Column(name = "tour_cost", precision = 10, scale = 3)
	public BigDecimal getTourCost() {
		return this.tourCost;
	}

	public void setTourCost(BigDecimal tourCost) {
		this.tourCost = tourCost;
	}

	@Column(name = "single_person", precision = 10, scale = 3)
	public BigDecimal getSinglePerson() {
		return this.singlePerson;
	}

	public void setSinglePerson(BigDecimal singlePerson) {
		this.singlePerson = singlePerson;
	}

	@Column(name = "Adults", precision = 10, scale = 3)
	public BigDecimal getAdults() {
		return this.adults;
	}

	public void setAdults(BigDecimal adults) {
		this.adults = adults;
	}

	@Column(name = "child w_o bed", precision = 10, scale = 3)
	public BigDecimal getChildWOBed() {
		return this.childWOBed;
	}

	public void setChildWOBed(BigDecimal childWOBed) {
		this.childWOBed = childWOBed;
	}

	@Column(name = "child with bed", precision = 10, scale = 3)
	public BigDecimal getChildWithBed() {
		return this.childWithBed;
	}

	public void setChildWithBed(BigDecimal childWithBed) {
		this.childWithBed = childWithBed;
	}

}