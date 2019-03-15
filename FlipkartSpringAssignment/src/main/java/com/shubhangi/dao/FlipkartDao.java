package com.shubhangi.dao;

import com.shubhangi.pojo.Login;
import com.shubhangi.pojo.Register;

public interface FlipkartDao 
{
	public int register(Register user);
	public Register validateUser(Login login);
}
