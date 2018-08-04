//This is the Television class with various instance members and getter().
//this class has a hashCode() and equals() method that checks the entry of duplicates 

package com.capgimeni.collectionClass;

public class Television {
	private String company;
	private String type;
	private boolean three_d_enabled;
	private double price;
	
	/**
	 * @param company
	 * @param type
	 * @param three_d_enabled
	 * @param price
	 */
	public Television(String company, String type, boolean three_d_enabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.three_d_enabled = three_d_enabled;
		this.price = price;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}






	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the three_d_enabled
	 */
	public boolean isThree_d_enabled() {
		return three_d_enabled;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", three_d_enabled=" + three_d_enabled + ", price="
				+ price + "]";
	}
	
	

}
