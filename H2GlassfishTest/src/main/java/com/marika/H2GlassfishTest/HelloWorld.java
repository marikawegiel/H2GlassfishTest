package com.marika.H2GlassfishTest;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class HelloWorld {
	private String message;
	private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public User doExecute(int id) {
    	String sql = "SELECT NAME FROM TEST WHERE ID = ?";
        return this.jdbcTemplate.queryForObject(sql,new Object[] { id }, User.class);
    }
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
		
	}
}
