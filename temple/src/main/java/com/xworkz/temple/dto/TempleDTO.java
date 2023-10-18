package com.xworkz.temple.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TempleDTO implements Serializable {

	private String name;
	private String place;
	private String mainGod;
	private int constructedYear;
	private String constructedBy;

	public TempleDTO(String name, String place, String mainGod, int constructedYear, String constructedBy) {
		super();
		this.name = name;
		this.place = place;
		this.mainGod = mainGod;
		this.constructedYear = constructedYear;
		this.constructedBy = constructedBy;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public int getConstructedYear() {
		return constructedYear;
	}

	public void setConstructedYear(int constructedYear) {
		this.constructedYear = constructedYear;
	}

	public String getConstructedBy() {
		return constructedBy;
	}

	public void setConstructedBy(String constructedBy) {
		this.constructedBy = constructedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
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
		TempleDTO other = (TempleDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", place=" + place + ", mainGod=" + mainGod + ", constructedYear="
				+ constructedYear + ", constructedBy=" + constructedBy + "]";
	}

}
