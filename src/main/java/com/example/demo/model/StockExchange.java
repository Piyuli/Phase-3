package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
@Entity

public class StockExchange {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false, unique = true)
    private String stockExName;
	
    @Column(nullable = false)
    private String brief;
    
    @Column(nullable = false)
    private String address;
    
    @Column()
    private String remarks;

	public int getId() {
		return id;
	}

	public String getStockExName() {
		return stockExName;
	}

	public void setStockExName(String stockExName) {
		this.stockExName = stockExName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@ManyToMany
    private List<Company> companies = new ArrayList<>();

}