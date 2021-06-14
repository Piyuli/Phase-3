package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
@Entity
public class Ipodetail {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
    private float pricePerShare;
	
	@Column(nullable = false)
    private Long totalShares;
	
    @Column(nullable = false)
    private String openDateTime;
	
    @Column(nullable = false)
    private String remarks;

	public int getId() {
		return id;
	}

	public float getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public Long getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(Long totalShares) {
		this.totalShares = totalShares;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	 @OneToOne(mappedBy = "ipodetail")
	    private Company company;
	    public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}
}