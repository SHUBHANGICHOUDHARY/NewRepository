package com.shubhangi.daoImplementaion;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shubhangi.Mapper.UserMapper;
import com.shubhangi.dao.FlipkartDao;
import com.shubhangi.pojo.Login;
import com.shubhangi.pojo.Register;

                                                                               
public class FlipkartDaoImplementation implements FlipkartDao
{
	@Autowired
	  DataSource datasource;
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int register(Register register) 
	{
		String query="insert into flipkart_User values (?,?,?,?,?,?)";
		return jdbcTemplate.update(query,new Object[] {register.getUserId(),register.getUserName(),register.getPassword(),register.getAddress(),register.getEmailId(),register.getContactNo()});
	}

	public Register validateUser(Login login) 
	{
		String query="select * from flipkart_User where userName="+login.getUserName()+"and password="+login.getPassword();
		List<Register>  register=jdbcTemplate.query(query, new UserMapper());
		return register.size() > 0 ? register.get(0) : null;
	}
}
