//This class Maintains the movie list by maintaining the TreeSet(). 

package com.capgemini.moviedetails;

import java.util.Set;
import java.util.TreeSet;

public class MovieDetailsList {
	private Set<MovieDetails> treeSetOfMovieList;

	// No-Argument Constructor to create the TreeSet().
	public MovieDetailsList() {
		treeSetOfMovieList = new TreeSet<MovieDetails>();
	}

	// This method adds the object to the TreeSet()
	public void addMovie(MovieDetails movieObjectToBeAdded) {
		treeSetOfMovieList.add(movieObjectToBeAdded);
	}

	// This method removes the movie from the treeSetofMovie.
	public String removeMovie(MovieDetails movieObjectToBeRemoved) {
		boolean statusChanged = treeSetOfMovieList.remove(movieObjectToBeRemoved);
		if (statusChanged == true) {
			return "The Movies " + movieObjectToBeRemoved.getMovieName() + " from the Set has been Deleted";
		} else {
			return "Failed to make changes to the TreeSet !! . Try Again!!";
		}
	}

	// This Method removes all the movies from the TreeSet.
	public String removeAllMovie() {
		boolean statusChanged = treeSetOfMovieList.removeAll(treeSetOfMovieList);
		if (statusChanged == true) {
			return "All the Movies from the Set has been Deleted";
		} else {
			return "Failed to make changes to the TreeSet !! . Try Again!!";
		}
	}

	// This Method finds the movie By MovieName and return a boolean value true if
	// it is found otherwise returns false.
	public boolean findMovieByMovieName(String movieToBeSearched) {
		for (MovieDetails movieDetails : treeSetOfMovieList) {
			if (movieDetails.getMovieName().equals(movieToBeSearched)) {
				return true;
			}
		}
		return false;

	}

	// This Method finds the movie By MovieGenere and return a boolean value true if
	// it is found otherwise returns false.
	public boolean findMovieByMovieGenere(String movieToBeSearched) {
		for (MovieDetails movieDetails : treeSetOfMovieList) {
			if (movieDetails.getGenere().equals(movieToBeSearched)) {
				return true;
			}
		}
		return false;

	}

	// This method returns the Set of total objects added in the tree set.
	public Set<MovieDetails> getAllObjects() {
		return treeSetOfMovieList;
	}

	// This Method sorts the TreeSet according to the given parameter.
	public void sortByArgument(int argumentToBeSortedOn) {
		MovieDetails.setParameterOfSorting(argumentToBeSortedOn);
	}
}
