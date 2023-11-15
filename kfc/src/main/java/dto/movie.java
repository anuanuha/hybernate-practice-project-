package dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class movie{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable =false)
	private String heroName;
	@Column(nullable =false)
	private double budget;
	private String directorName;
	private String heroineName;
	@Lob
	private byte[] heroImage;
	@Column(unique=true)
	private Date releaseDate;
	@Column(unique=true)
	private String movieName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getHeroineName() {
		return heroineName;
	}
	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}
	public byte[] getHeroImage() {
		return heroImage;
	}
	public void setHeroImage(byte[] heroImage) {
		this.heroImage = heroImage;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
}

	