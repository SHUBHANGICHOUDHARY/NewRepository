package com.Capgemini.Movie;

public class TestMovieDetails 
{
	public static void main(String args[])
	{
		Movie_Details m1=new Movie_Details("K3G","Shahrukh","Kajol","Family");
		Movie_Details m2=new Movie_Details("DDLJ","Shahrukh","Kajol","Romance");
		Movie_Details m3=new Movie_Details("Ishqzaade","Arjun","Parineeti","Politics");
		Movie_Details m4=new Movie_Details("Krish","Hritik","Priyanka","Science Fiction");
		
		MovieDetailsList movie=new MovieDetailsList();
		
		movie.add_movie(m1);
		movie.add_movie(m2);
		movie.add_movie(m3);
		movie.add_movie(m4);
		
		for(Movie_Details m: movie.get_AllMovies())
		{
			System.out.println(m);
		}
		
		movie.remove_movie(m2);
		for(Movie_Details m: movie.get_AllMovies())
		{
			System.out.println(m);
		}
		
		movie.remove_AllMovies();
		for(Movie_Details m: movie.get_AllMovies())
		{
			System.out.println(m);
		}
		System.out.println(movie.find_movie_By_mov_Name(m1));
		
		System.out.println(movie.find_movie_By_Genre("family"));
	}
}
