package demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class student {
	@Id
	private int age;
	private String name;
	private double per;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	

}
