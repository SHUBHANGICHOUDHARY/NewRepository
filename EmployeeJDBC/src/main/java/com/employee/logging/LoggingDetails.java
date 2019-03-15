package com.employee.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingDetails 
{
	public Logger logger;
	FileHandler fileHandler;
	public LoggingDetails(String file_name) throws IOException 
	{
		File file=new File("log.txt");
		if(file.exists())
		{
			file.createNewFile();
		}
		
		fileHandler = new FileHandler(file_name,true);
		logger =Logger.getLogger("test");
		logger.addHandler(fileHandler);
		SimpleFormatter formatter =new SimpleFormatter();
		fileHandler.setFormatter(formatter);
	}
}
