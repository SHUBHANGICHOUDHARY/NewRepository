package com.Capgemini.Movie;

import java.util.ArrayList;

public class MovieDetailsList 
{
	ArrayList<Movie_Details> array;
	
	public MovieDetailsList() 
	{
		array=new ArrayList<>();
	}
	public void add_movie(Movie_Details m)
	{
		array.add(m);
	}
	
	public void remove_movie(Movie_Details m)
	{
		array.remove(m);
	}
	
	public void remove_AllMovies()
	{
		array.removeAll(array);
	}
	
	public ArrayList<Movie_Details> get_AllMovies()
	{
		return array;
	}
	
	public void find_movie_By_mov_Name(Movie_Details m)
	{
		int index = array.indexOf(m.getMov_Name());
	}
	
	public void find_movie_By_Genre(String genre)
	{
		Movie_Details m=null;
		for(Movie_Details m1:array) 
		{
			if(m1.getGenre().equals(genre))
				m=m1;
		}
	}
}
