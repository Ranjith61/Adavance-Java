package com.xworkz.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class WarDTO implements Serializable {
	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Collection<CountryDTO> country;
	private String wonBy;
	
	public WarDTO() {
	}
	
	
	public WarDTO(int id, LocalDate startDate, LocalDate endDate, Collection<CountryDTO> country, String wonBy) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.country = country;
		this.wonBy = wonBy;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Collection<CountryDTO> getCountry() {
		return country;
	}
	public void setCountry(Collection<CountryDTO> country) {
		this.country = country;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		WarDTO other = (WarDTO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WarDTO [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", country=" + country
			;
	}

	
}
