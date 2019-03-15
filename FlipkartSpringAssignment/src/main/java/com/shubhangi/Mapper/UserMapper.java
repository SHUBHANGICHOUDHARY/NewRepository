package com.shubhangi.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shubhangi.pojo.Register;

public class UserMapper implements RowMapper<Register>
{
	public Register mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Register user=new Register();
		
		user.setUserId(rs.getInt("userId"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setAddress(rs.getString("address"));
		user.setEmailId(rs.getString ("emailId"));
		user.setContactNo(rs.getLong("contactNo"));
		return user;
		
	}
}
