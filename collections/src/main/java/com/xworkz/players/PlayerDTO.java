package com.xworkz.players;

public class PlayerDTO {
	private int id;
	private String name;
	private String country;
	private Sport sport;
	int age;

	public PlayerDTO(int id, String name, String country, Sport sport, int age) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.sport = sport;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		PlayerDTO other = (PlayerDTO) obj;
		if (age != other.age)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PlayerDTO [id=" + id + ", name=" + name + ", country=" + country + ", sport=" + sport + ", age=" + age
				+ "]";
	}

}

enum Sport {
	CIRCKET, FOOTBALL, TENNIS;
}
