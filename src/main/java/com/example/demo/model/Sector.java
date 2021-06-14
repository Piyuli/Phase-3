package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Sector {
	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false, unique = true)
    private String sectorName;
    
    @Column(nullable = false)
    private String brief;

	public int getId() {
		return id;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}
	 @OneToOne(mappedBy = "sector")
	    private Company company;
	    public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

    

}