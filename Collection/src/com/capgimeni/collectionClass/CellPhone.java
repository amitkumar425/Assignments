//This is the CellPhone class with various instance members and getter().
//this class has a hashCode() and equals() method that checks the entry of duplicates 

package com.capgimeni.collectionClass;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operating_system;
	private double price;
	
	
	/**
	 * @param company
	 * @param model
	 * @param description
	 * @param operating_system
	 * @param price
	 */
	public CellPhone(String company, String model, String description, String operating_system, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operating_system = operating_system;
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
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operating_system == null) ? 0 : operating_system.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operating_system == null) {
			if (other.operating_system != null)
				return false;
		} else if (!operating_system.equals(other.operating_system))
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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the operating_system
	 */
	public String getOperating_system() {
		return operating_system;
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
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operating_system=" + operating_system + ", price=" + price + "]";
	}
	
	
	
}
