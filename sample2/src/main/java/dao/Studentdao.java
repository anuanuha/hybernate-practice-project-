package dao;

import java.util.List;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class Studentdao {
EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
EntityManager m=f.createEntityManager();
EntityTransaction t=m.getTransaction();

public void addStudent(Student s) {
	t.begin();
	m.persist(s);
	t.commit();
	
}
public void fetchStudent(int id)
{
	Student s=m.find(Student.class,id);
	if(s!=null) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPercentage());
		System.out.println(s.getAddress());
	}
	else {
		System.out.println("data not found");
	}
}
public void removeStudent(int id) {
	Student s=m.find(Student.class,id);
	if(s!=null) {
		t.begin();
		m.remove(s);
		t.commit();
	}else
	{
		System.out.println("data not found");
	}
}
public void updateStudent(int id,String newName) {
	Student s=m.find(Student.class,id);
	if(s!=null) {
		s.setName(newName);
		t.begin();
		m.merge(s);
		t.commit();
	}else
	{
		System.out.println("data not found");
	}
}
public void fetchAll() {
	Query q= m.createQuery("select a from Student a");
	List<Student> s=q.getResultList();
	for (Student w : s) {
		System.out.println(w.getId());
		System.out.println(w.getName());
		System.out.println(w.getPercentage());
		System.out.println(w.getAddress());
	}
}


}
