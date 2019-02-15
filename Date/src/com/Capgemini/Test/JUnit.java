package com.Capgemini.Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.Capgemini.Date.DateDifference;
import com.Capgemini.Date.MyDate;
public class JUnit
{
	
	@Test
	public void testGetDateDifferenceCase1()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(06,04,2011));
		
		System.out.println("I am in JUnit");
		Assert.assertEquals(differencevalue, 0);
	}
	
	@Test
	public void testGetDateDifferenceCase2()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,04,2011));
		Assert.assertEquals(differencevalue, 12);
	}
	
	@Test
	public void testGetDateDifferenceCase3()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,05,2011));
		Assert.assertEquals(differencevalue, 42);
	}
	
	@Test
	public void testGetDateDifferenceCase4()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,06,2011));
		Assert.assertEquals(differencevalue, 73);
	}
	
	@Test
	public void testGetDateDifferenceCase5()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2011));
		Assert.assertEquals(differencevalue, 256);
	}
	
	@Test
	public void testGetDateDifferenceCase6()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2012));
		Assert.assertEquals(differencevalue, 622);
	}
	
	@Test
	public void testGetDateDifferenceCase7()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2013));
		Assert.assertEquals(differencevalue, 987);
	}
	
	@Test
	public void testGetDateDifferenceCase8()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2113));
		Assert.assertEquals(differencevalue, 37511);
	}
	
	@Test
	public void testGetDateDifferenceCase9()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2413));
		Assert.assertEquals(differencevalue,147084);
	}
	
	@Test
	public void testGetDateDifferenceCase10()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2813));
		Assert.assertEquals(differencevalue, 293181);
	}
	
	@Test
	public void testGetDateDifferenceCase11()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06,01,2011),new MyDate(06,03,2011));
		Assert.assertEquals(differencevalue, 59);
	}
	
	@Test
	public void testGetDateDifferenceCase12()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06, 01, 2012),new MyDate(06, 03, 2012));
		Assert.assertEquals(differencevalue,60);
	}
	
	@Test
	public void testGetDateDifferenceCase13()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(06, 02, 2012),new MyDate(06, 03, 2012));
		Assert.assertEquals(differencevalue, 29);
	}
	
	@Test
	public void testGetDateDifferenceCase14()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(22, 01, 2012),new MyDate(15, 11, 2012));
		Assert.assertEquals(differencevalue, 298);
	}
	
	@Test
	public void testGetDateDifferenceCase15()
	{
		long differencevalue=DateDifference.getDateDifference(new MyDate(6, 2, 2012),new MyDate(6, 12, 2012));
		Assert.assertEquals(differencevalue, 304);
	}
}

