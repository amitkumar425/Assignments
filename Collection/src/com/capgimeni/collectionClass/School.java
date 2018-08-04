//This is the School class with various instance members and getter().
//this class has a hashCode() and equals() method that checks the entry of duplicates  

package com.capgimeni.collectionClass;

public class School {
	private String name;
	private String city;
	private String school_district;
	private int great_school_ranking;
	
	
	
	/**
	 * @param name
	 * @param city
	 * @param school_district
	 * @param great_school_ranking
	 */
	public School(String name, String city, String school_district, int great_school_ranking) {
		super();
		this.name = name;
		this.city = city;
		this.school_district = school_district;
		this.great_school_ranking = great_school_ranking;
	}
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school_district == null) ? 0 : school_district.hashCode());
		return result;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school_district == null) {
			if (other.school_district != null)
				return false;
		} else if (!school_district.equals(other.school_district))
			return false;
		return true;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the school_district
	 */
	public String getSchool_district() {
		return school_district;
	}
	/**
	 * @return the great_school_ranking
	 */
	public int getGreat_school_ranking() {
		return great_school_ranking;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", school_district=" + school_district
				+ ", great_school_ranking=" + great_school_ranking + "]";
	}
	
	
}
