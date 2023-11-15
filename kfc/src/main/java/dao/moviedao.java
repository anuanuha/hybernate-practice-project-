package dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Date;

import dto.movie;

public class moviedao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void fetchDetails(int id) throws IOException {
		movie movie = manager.find(movie.class, id);
		if (movie != null) {
			System.out.println("Movie Id : " + movie.getId());
			System.out.println("Movie Name : " + movie.getMovieName());
			System.out.println("Hero Name : " + movie.getHeroineName());
			System.out.println("Heroine Name : " + movie.getHeroineName());
			System.out.println("Release Date : " + movie.getReleaseDate());
			System.out.println("Movie Budget : " + movie.getBudget());
			FileOutputStream fs = new FileOutputStream(
					"C:\\Users\\Anu H A\\OneDrive\\Desktop\\anu" + movie.getHeroName() + ".jpeg");
			fs.write(movie.getHeroImage());
			System.out.println("************Check desktop for image**************");
		} else {
			System.out.println("oops id not available");
		}
	}

	public void fetchAllDetails() throws IOException {
		Query q = manager.createQuery("select a from movie a");
		List<movie> m = q.getResultList();
		if (m.isEmpty()) {
			System.out.println("oops not data available");
		} else {
			for (movie movie : m) {
				System.out.println("Movie Id : " + movie.getId());
				System.out.println("Movie Name : " + movie.getMovieName());
				System.out.println("Hero Name : " + movie.getHeroineName());
				System.out.println("Heroine Name : " + movie.getHeroineName());
				System.out.println("Release Date : " + movie.getReleaseDate());
				System.out.println("Movie Budget : " + movie.getBudget());
				FileOutputStream fs = new FileOutputStream(
						"C:\\Users\\Anu H A\\OneDrive\\Desktop\\anu" + movie.getHeroName() + ".jpeg");
				fs.write(movie.getHeroImage());

			}
			System.out.println("************Check kfi folder for images**************");
		}
	}

	public void addMovie(movie k) {
		transaction.begin();
		manager.persist(k);
		transaction.commit();
		System.out.println("***********Added**********");
	}

	public void removeMovie(int id) {
		movie movie = manager.find(movie.class, id);
		if (movie != null) {
			transaction.begin();
			manager.remove(movie);
			transaction.commit();
			System.out.println("******data removed*******");
		} else {
			System.out.println("oops id not available");
		}
	}

	public void updateDate(int id, Date newDate) {
		movie movie = manager.find(movie.class, id);
		if (movie != null) {
			movie.setReleaseDate(newDate);
			transaction.begin();
			manager.merge(movie);
			transaction.commit();
			System.out.println("******data Updated(-_-)*******");
		} else {
			System.out.println("oops id not available");
		}
	}

}
