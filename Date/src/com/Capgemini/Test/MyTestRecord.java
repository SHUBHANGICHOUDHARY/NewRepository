package com.Capgemini.Test;

import com.Capgemini.Date.MyDate;

public class MyTestRecord 
{
	public MyDate startDate;
	public MyDate endDate;
	public long expectedResult;
	
	public MyTestRecord(MyDate startDate, MyDate endDate, int expectedResult) 
	{
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedResult = expectedResult;
	}
	
}
