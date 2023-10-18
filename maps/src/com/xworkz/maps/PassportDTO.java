package com.xworkz.maps;

import java.io.Serializable;
import java.time.LocalDate;

public class PassportDTO implements Serializable{

	private int id;
	private long no;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expiryDate;
	private Type passport;
	
	public PassportDTO(int id, long no, LocalDate issuedDate, String issuedBy, LocalDate expiryDate, Type passport) {
		super();
		this.id = id;
		this.no = no;
		this.issuedDate = issuedDate;
		this.issuedBy = issuedBy;
		this.expiryDate = expiryDate;
		this.passport = passport;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Type getPassport() {
		return passport;
	}
	public void setPassport(Type passport) {
		this.passport = passport;
	}
	
	@Override
	public String toString() {
		return "PassportDTO [id=" + id + ", no=" + no + ", issuedDate=" + issuedDate + ", issuedBy=" + issuedBy
				+ ", expiryDate=" + expiryDate + ", passport=" + passport + "]";
	}
	
	
}