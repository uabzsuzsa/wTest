package com.flexiton.web.cnmt.model.w;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * https://dzone.com/articles/spring-boot-jpa-hibernate-oracle
 * 
 * 
 *
 */
@Entity
@Table(name = "web_building")
public class WebBuilding {
	
	@EmbeddedId
	private WebBuildingId id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="address_ext")
	private String addressExtension;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="pm_building_id")
	private String pmBuildingId;
	
	@Column(name="remark")
	private String remark;

	public String getAddress() {
		return address;
	}

	public String getAddressExtension() {
		return addressExtension;
	}

	public Date getDate() {
		return date;
	}

	public String getPmBuildingId() {
		return pmBuildingId;
	}

	public String getRemark() {
		return remark;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressExtension(String addressExtension) {
		this.addressExtension = addressExtension;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPmBuildingId(String pmBuildingId) {
		this.pmBuildingId = pmBuildingId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public WebBuildingId getId() {
		return id;
	}

	public void setId(WebBuildingId id) {
		this.id = id;
	}
	
	

}
