package crudoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class mainclass {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		boolean flag = true;
		while (flag) {
			System.out.println("1.Add\n2.fetch\n3.Update\n4.Remove\n5.Fetch All\n6.Exit");
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1: {
				employee e=new employee();
				System.out.println("Enter name");
				e.seteName(sc.next());
				System.out.println("Enter Salary");
				e.setEsalary(sc.nextDouble());
				System.out.println("enter the companyName");
				e.setCompanyName(sc.next());
				System.out.println("enter the Adrress");
				e.setAdrress(sc.next());
				Scanner sc2 = new Scanner(System.in);
				System.out.println("enter the  Resume path");
				FileInputStream fi=new FileInputStream(sc2.nextLine());
				byte[] b = new byte[fi.available()];
				fi.read(b);
				e.setResume(b);
				t.begin();
				m.persist(e);
				t.commit();
				System.out.println("----------------Added-----------------");
						
			}
			break;
			case 2: {
				System.out.println("Enter id");
				employee e = m.find(employee.class, sc.nextInt());
				if (e != null) {
					System.out.println("Id : " + e.getEid());
					System.out.println("eName : " + e.geteName());
					System.out.println("Esalary: " + e.getEsalary());
					System.out.println("CompanyName : " + e.getCompanyName());
					System.out.println("Adrress: " + e.getAdrress());
					System.out.println("Enter Path");
					Scanner sc3=new Scanner(System.in);
					FileOutputStream fs = new FileOutputStream(sc3.nextLine());
					fs.write(e.getResume());
					System.out.println("---------------fetching-------------");			
			}else
			{
				System.out.println("invalid id");
			}
			}
				break;
				
				case 3:{
					System.out.println("Enter id");
					employee e = m.find(employee.class, sc.nextInt());
					if (e != null) {
						System.out.println("Enter new Salary");
						e.setEsalary(sc.nextDouble());
						t.begin();
						m.merge(e);
						t.commit();
						System.out.println("Updated----------------");
					} else {
						System.out.println("Invalid id");
					}
				}
					break;
				
			case 4:{
				System.out.println("enter the id");
				employee e = m.find(employee.class, sc.nextInt());
				if (e != null) {
					t.begin();
					m.remove(e);
					t.commit();
					System.out.println("Removed----------------");
				} else {
					System.out.println("Invalid id");
				}
			}
				break;
			case 5:
			{
				Query q = m.createQuery("select a from employee a");
				List<employee> z = q.getResultList();
				for (employee e : z) {

					System.out.println("Id : " + e.getEid());
					System.out.println("Name : " + e.geteName());
					System.out.println("Salary : " + e.getEsalary());
					System.out.println("Address : " + e.getAdrress());
					System.out.println("Company Name : " + e.getCompanyName());
				}
			}
				break;
			case 6:
			{
				flag = false;
				System.out.println("thank you");
			}
				break;
			default: {
				System.out.println("Enter valid option....!");
			}
				break;
			}
				
			}
				
				
				
			}
		}
	


