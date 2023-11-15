package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pancard {
	@Id
	private String panNo;
	private String name;
	private String Address;
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
