package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass {
	 public static void main(String[] args) {
		 EntityManagerFactory f = Persistence.createEntityManagerFactory("mapping");
			EntityManager m = f.createEntityManager();
			EntityTransaction t = m.getTransaction();
			//pancard object
			pancard pc = new pancard();
			pc.setAddress("bengaluru");
			pc.setName("kartik");
			pc.setPanNo("nhcd7676");
			//person object
			person per=new person();
			per.setName("kartik");
			per.setDob("2003");
			per.setAge(25);
			//setting pancard object for a person
			per.setP(pc);
			t.begin();
			m.persist(pc);
			m.merge(per);
			t.commit();
			
			
			
	}

}