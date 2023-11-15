package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import dao.moviedao;
import dto.movie;

public class mainclass {
	public static void main(String[] args) throws IOException {
		moviedao dao=new moviedao();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("------------------------------");
			System.out.println("1.Get Movie Details");
			System.out.println("2.Add Movie Details");
			System.out.println("3.Remove Movie data");
			System.out.println("4.Get All the Movie Details");
			System.out.println("5.Update Release date");
			System.out.println("6.Exit");
			System.out.println("------select valid option-------");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter Movie Id");
				dao.fetchDetails(sc.nextInt());
			}
				break;
			case 2: {
				movie k = new movie();
				System.out.println("Enter Hero Name");
				k.setHeroName(sc.next());
				System.out.println("Enter Movie budget");
				k.setBudget(sc.nextDouble());
				System.out.println("Enter Director Name");
				k.setDirectorName(sc.next());
				System.out.println("Enter Heroine Name");
				k.setHeroineName(sc.next());
				System.out.println("Enter Release Date");
				Date d = new Date(sc.next());
				k.setReleaseDate(d);
				System.out.println("Enter Movie Name");
				k.setMovieName(sc.next());
				System.out.println("Enter Image path");
				Scanner sc2 = new Scanner(System.in);
				FileInputStream fs = new FileInputStream(sc2.nextLine());
				byte[] arr = new byte[fs.available()];
				fs.read(arr);
				k.setHeroImage(arr);
				dao.addMovie(k);

			}
				break;
			case 3: {
				System.out.println("Enter Movie Id");
				dao.removeMovie(sc.nextInt());
			}
				break;
			case 4: {
				dao.fetchAllDetails();
			}
				break;
			case 5: {
				System.out.println("Enter Movie Id");
				int id = sc.nextInt();
				System.out.println("Enter New Release date");
				dao.updateDate(id, new Date(sc.next()));
			}
				break;
			case 6: {
				flag = false;
				System.out.println("Bye Bye Come again-------!-_-!--------");
			}
				break;
			default: {
				System.out.println("rajkumar enter valid option......!");
			}
				break;
				
				
			}
			
			}
		}
	}
	


	