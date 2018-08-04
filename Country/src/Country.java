//Class implementing the methods to find out the various information among the given countries
//This class uses the concept of VARIABLE-ARGUMENT method to find the largest from the list 
//containing any number of counties.

public class Country {
	
	//Instance members 
	private String countryName;
	private double population;
	private double area;

	// constructor to assign the name,population and area
	public Country(String countryName, double population, double area) {
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}

	// to get country name
	public String getCountryName() {
		return countryName;
	}

	// Var-Arg Method to Find LargestArea
	public static Country largestArea(Country... country) {
		double largestArea = -1;
		int counter = -1;
		for (int i = 0; i < country.length; i++) {
			if (country[i].area > largestArea) {
				largestArea = country[i].area;
				counter = i;
			}
		}
		return country[counter];
	}

	// Var-Arg Method to find LargestPopulation
	public static Country largestPopulation(Country... country) {
		double largestPopulation = -1;
		int counter = -1;
		for (int i = 0; i < country.length; i++) {
			if (country[i].population > largestPopulation) {
				largestPopulation = country[i].population;
				counter = i;
			}
		}
		return country[counter];
	}

	// Var-Arg method to find Largest Population Density
	public static Country largestPopulationDensity(Country... country) {
		double largestPopulationDensity = -1;
		int counter = -1;
		for (int i = 0; i < country.length; i++) {
			if ((country[i].population / country[i].area) > largestPopulationDensity) {
				largestPopulationDensity = (country[i].population / country[i].area);
				counter = i;
			}
		}
		return country[counter];
	}

	// toString() to print the various attributes of the country
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", population=" + population + ", area=" + area + "]";
	}

}
