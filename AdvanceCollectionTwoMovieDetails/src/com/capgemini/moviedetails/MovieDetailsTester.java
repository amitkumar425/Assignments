//This is the Tester class that implements MovieDetailsList.java and MovieDetails.java.
package com.capgemini.moviedetails;

import java.util.Set;

public class MovieDetailsTester {

	public static void main(String[] args) {

		// Creating the objects of MovieDetails and handling it to MovieDetailsList to
		// keep a record of.
		MovieDetails hny = new MovieDetails("Happy New Year", "Sharukh Khan", "Deepika Padukon", "Romance");
		MovieDetails jthj = new MovieDetails("Jab Tak Hain Jaan", "Sharukh Khan", "Anushka Sharma", "Romance");
		MovieDetails parmanu = new MovieDetails("Parmanu", "John Abhraham", "Dp", "Trg");

		// Creating the Object of MovieDetailList
		MovieDetailsList treeSetOfMovie = new MovieDetailsList();

		// Calling the sortByArgument() to sort according to the given argument.
		treeSetOfMovie.sortByArgument(3);

		// Adding the movies to the MovieDetailsList.
		treeSetOfMovie.addMovie(hny);
		treeSetOfMovie.addMovie(jthj);
		treeSetOfMovie.addMovie(parmanu);

		// Trying to Add the same movie to the MovieDetailsList
		treeSetOfMovie.addMovie(hny);
		treeSetOfMovie.addMovie(parmanu);

		// Getting set of all the Movies added to the MovieDetailsList.
		Set<MovieDetails> set = treeSetOfMovie.getAllObjects();

		// Displaying the content of the MovieDetailsList to observe the sorting
		// parameter and duplicate object addition.
		set.stream().forEach(arg -> System.out.println(arg));

		// Searching the movie by movieName
		boolean found = treeSetOfMovie.findMovieByMovieName("Parmanu");
		if (found == true) {
			System.out.println("Movie found");
		} else {
			System.out.println("Movie Not Found");
		}

		// Searching the movie by movieGenere
		found = treeSetOfMovie.findMovieByMovieGenere("Romance");
		if (found == true) {
			System.out.println("Movie found");
		} else {
			System.out.println("Movie Not Found");
		}

		// Trying to remove the movie by passing the movie reference.
		String message = treeSetOfMovie.removeMovie(parmanu);
		System.out.println(message);

		// Trying to See if the movie has been deleted from from the treeSet or not.
		found = treeSetOfMovie.findMovieByMovieName(parmanu.getMovieName());
		if (found == true) {
			System.out.println("Movie found");
		} else {
			System.out.println("Movie Not Found");
		}

		// Trying to delete all the movie from the treeSet.
		message = treeSetOfMovie.removeAllMovie();
		System.out.println(message);

		// Trying to See if the movie has been deleted from from the treeSet or not.
		found = treeSetOfMovie.findMovieByMovieName(hny.getMovieName());
		if (found == true) {
			System.out.println("Movie found");
		} else {
			System.out.println("Movie Not Found");

		}
	}
}
