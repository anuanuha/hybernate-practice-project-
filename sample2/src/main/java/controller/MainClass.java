package controller;

import java.util.Scanner;

import dao.Studentdao;
import dto.Student;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentdao dao=new Studentdao();
	
	boolean flag = true;
	while(flag) {
		System.out.println("1.Add\n2.Fetch\n3.Update\n4.remove\n5.fetchAll\n6.exit");
		switch(sc.nextInt()) {
		case 1:{
			Student s=new Student();
			System.out.println("enter the name");
			s.setName(sc.next());
			System.out.println("enter the percentage");
			s.setPercentage(sc.nextDouble());
			System.out.println("enter the address");
			s.setName(sc.next());
			dao.addStudent(s);		
		}
		break;
		case 2:{
			System.out.println("enter the id");
			dao.fetchStudent(sc.nextInt());

		}
		break;
		case 3:{
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the new name");
			String newName=sc.next();
			dao.updateStudent(id,newName);
	}
		break;
		case 4:{
			System.out.println("enter the id");
			dao.removeStudent(sc.nextInt());
}
		break;
		case 5:{
			
			System.out.println("enter the id");
			dao.removeStudent(sc.nextInt());
		}
		break;
		case 6:{
			flag = false;
			System.out.println("thank you");
			//s.setName(sc.next());
}
		break;
		default:
			System.out.println("invalid option");
			break;
		}
	}
	}
}