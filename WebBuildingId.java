package com.flexiton.web.cnmt.model.w;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * https://www.callicoder.com/hibernate-spring-boot-jpa-composite-primary-key-example/
 * https://vladmihalcea.com/the-best-way-to-map-a-composite-primary-key-with-jpa-and-hibernate/
 * 
 * @author zskollath
 *
 */
@Embeddable
public class WebBuildingId implements Serializable {
	
	@Column(name = "id")
	private long id;
	
	@Column(name ="schema_name")
	private String schemaName;
	
	public WebBuildingId(){
	}

	public WebBuildingId(long id, String schemaName) {
		this.id = id;
		this.schemaName = schemaName;
	}

	public long getId() {
		return id;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((schemaName == null) ? 0 : schemaName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebBuildingId other = (WebBuildingId) obj;
		if (id != other.id)
			return false;
		if (schemaName == null) {
			if (other.schemaName != null)
				return false;
		} else if (!schemaName.equals(other.schemaName))
			return false;
		return true;
	}

	
	
	
	
	
}
