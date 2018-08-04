//Driver program to test which country has the highest population,population density and area

public class CountryTester {

	public static void main(String[] args) {

		// Creating the 04 Country Objects with the parameter as name,population,area(sq
		// miles).
		Country india = new Country("INDIA", 1_33_90_00_000, 12_69_000);
		Country pakistan = new Country("PAKISTAN", 21_27_00_000, 3_40_500);
		Country china = new Country("CHINA", 1_41_00_00_000, 37_05_000);
		Country brazil = new Country("BRAZIL", 20_77_00_000, 32_88_000);

		// printing the attributes of all the country by toString method.
		System.out.println(india);
		System.out.println(pakistan);
		System.out.println(china);
		System.out.println(brazil);

		// printing the country with largest area,population,density using Var-Arg
		// method
		System.out.println("Country with the largest Area = "
				+ Country.largestArea(india, pakistan, china, brazil).getCountryName());
		System.out.println("Country with the largest Population = "
				+ Country.largestPopulation(india, pakistan, china, brazil).getCountryName());
		System.out.println("Country with the largest Population Density = "
				+ Country.largestPopulationDensity(india, pakistan, china, brazil).getCountryName());
	}

}
