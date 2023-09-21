package com.subha.CertificateService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {

	@Id
	@Column(name = "cid")
	private int cid;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int cid, String name, String address) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", name=" + name + ", address=" + address + "]";
	}

}
