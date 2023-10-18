package com.xworkz.players;

import java.io.Serializable;

public class MovieDTO implements Serializable {
	private int id;
	private String name;
	private language lang;
	private String producer;
	private String director;
	private double budget;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(budget);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDTO other = (MovieDTO) obj;
		if (Double.doubleToLongBits(budget) != Double.doubleToLongBits(other.budget))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		return true;
	}
	public MovieDTO(int id, String name, language lang, String producer, String director, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.producer = producer;
		this.director = director;
		this.budget = budget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public language getLang() {
		return lang;
	}
	public void setLang(language lang) {
		this.lang = lang;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", lang=" + lang + ", producer=" + producer + ", director="
				+ director + ", budget=" + budget + "]";
	}
	

}



enum language {
	HINDI, KANNADA, ENGLISH;

}
