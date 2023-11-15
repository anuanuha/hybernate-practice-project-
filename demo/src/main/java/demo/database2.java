package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class database2 {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t= m.getTransaction();
	student s= new student();
		s.setAge(27);
		s.setName("jvfhdj");
		s.setPer(86);
		t.begin();
		m.persist(s);
		t.commit();		
		
	}
}
