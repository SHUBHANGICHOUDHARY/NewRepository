package com.shubhangi.test;

import java.io.IOException;
import java.util.logging.Level;

import com.shubhangi.log.Logging;

public class TestLogging {

	public static void main(String[] args) 
	{
		try
		{
			Logging log=new Logging("log.txt");
			log.logger.setLevel(Level.SEVERE);
		
			log.logger.info("Information");
			log.logger.warning("Warning");
			log.logger.severe("Severe");
			log.logger.fine("Fine");
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
