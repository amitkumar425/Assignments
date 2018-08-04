//This is the Laptop class with various instance members and getter().
//this class has a hashCode() and equals() method that checks the entry of duplicates 

package com.capgimeni.collectionClass;

public class Laptop {
	private String company;
	private String model;
	private String operating_system;
	private String processor;
	
	/**
	 * @param company
	 * @param model
	 * @param operating_system
	 * @param processor
	 */
	public Laptop(String company, String model, String operating_system, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operating_system = operating_system;
		this.processor = processor;
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
		Laptop other = (Laptop) obj;
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
	 * @return the operating_system
	 */
	public String getOperating_system() {
		return operating_system;
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operating_system=" + operating_system
				+ ", processor=" + processor + "]";
	}
	
	

}
