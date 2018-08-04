//Class containing the various instance members and instance method to implement the MovieDetails.

package com.capgemini.moviedetails;

public class MovieDetails implements Comparable<MovieDetails> {
	private static int parameterOfSorting;
	private String movie_Name;
	private String lead_Actor;
	private String lead_Actress;
	private String genere;

	/**
	 * @param movie_Name
	 * @param lead_Actor
	 * @param lead_Actress
	 * @param genere
	 */
	public MovieDetails(String movie_Name, String lead_Actor, String lead_Actress, String genere) {
		this.movie_Name = movie_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		this.genere = genere;
	}

	// Getter Methods to get the values of instance member.
	public String getMovieName() {
		return movie_Name;
	}

	public String getLead_Actor() {
		return lead_Actor;
	}

	public String getLead_Actress() {
		return lead_Actress;
	}

	public String getGenere() {
		return genere;
	}

	// setter methods to set the value of parameterOfSorting.
	public static void setParameterOfSorting(int parameterOfSorting) {
		MovieDetails.parameterOfSorting = parameterOfSorting;
	}

	@Override
	public String toString() {
		return "MovieDetails [getMovieName()=" + getMovieName() + ", getLead_Actor()=" + getLead_Actor()
				+ ", getLead_Actress()=" + getLead_Actress() + ", getGenere()=" + getGenere() + "]";
	}

	@Override
	// Overridden compareTo() to sort according to given parameter
	public int compareTo(MovieDetails movieDetail) {
		switch (parameterOfSorting) {
		case 1:
			return this.movie_Name.compareTo(movieDetail.getMovieName());
		case 2:
			return this.lead_Actor.compareTo(movieDetail.getLead_Actor());
		case 3:
			return this.lead_Actress.compareTo(movieDetail.getLead_Actress());
		case 4:
			return this.genere.compareTo(movieDetail.getGenere());
		default:
			return this.movie_Name.compareTo(movieDetail.getMovieName());
		}
	}

}
