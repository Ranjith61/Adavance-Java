package com.xworkz.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ActorDTO implements Comparable<ActorDTO>{
	
	private Double id;
	private String name;
	private String LangKnown;
	private String gender;
	private String Country;
	
	@Override
	public int compareTo(ActorDTO arg) {
		ActorDTO temp =this;
		return temp.getName().compareTo(arg.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ActorDTO other = (ActorDTO) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
