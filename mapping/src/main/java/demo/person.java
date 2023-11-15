package demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class person {
	@Id
private String name;
private int age;
private String dob;
@OneToOne
private pancard p;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public pancard getP() {
	return p;
}
public void setP(pancard p) {
	this.p = p;
}

}
