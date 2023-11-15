package crudoperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	
	@Column(unique=true)
	private String eName;
	
	@Column(nullable=false)
	private double esalary;
	
	@Column(unique=true)
	private String companyName;
	
	@Column(unique=true)
	private String Adrress;
	
	@Lob
	private byte[] Resume;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAdrress() {
		return Adrress;
	}
	public void setAdrress(String adrress) {
		Adrress = adrress;
	}
	public byte[] getResume() {
		return Resume;
	}
	public void setResume(byte[] resume) {
		Resume = resume;
	}
	
	
	

}
