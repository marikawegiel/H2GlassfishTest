package com.marika.H2GlassfishTest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class User implements RowMapper{
	public int id;
	public String name;
	
	
	public User () {
		
	}
	
	public User (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u = new User(rs.getInt("ID"), rs.getString("NAME"));
		return u;
	}
}
