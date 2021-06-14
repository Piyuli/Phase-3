package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

@Entity
public class Company {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
    private String company_name;
	
	@Column(nullable = false)
	private float turnover;
	
	@Column(nullable = false)
	private String ceo;
	
	 @Column(nullable = false)
	    private String briefWriteup;
	 
	 public int getId() {
		return id;
	 }
	
	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public float getTurnover() {
		return turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

		@OneToOne
	    private Sector sector;
	    public Sector getSector() {
			return sector;
		}

		public void setSector(Sector sector) {
			this.sector = sector;
		}
	
	
		@OneToOne
	    private Ipodetail ipodetail;
	    public Ipodetail getIpodetail () {
			return ipodetail;
		}

		public void setIpodetail(Ipodetail ipodetail) {
			this.ipodetail = ipodetail;
		}
	
		@ManyToMany
	    private List<StockExchange> stockExchanges = new ArrayList<>();

		public List<StockExchange> getStockExchanges() {
			return stockExchanges;
		}

		public void setStockExchanges(List<StockExchange> stockExchanges) {
			this.stockExchanges = stockExchanges;
		}

	

}
