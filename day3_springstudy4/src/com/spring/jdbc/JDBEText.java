package com.spring.jdbc;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.activation.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.context.support.DelegatingThemeSource;

public class JDBEText {

	
	private ApplicationContext ctx = null;
	private JdbcTemplate jdbcTemplate;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
	}
	
	/**
	 * 执行inser， UPDATE ，delect
	 * 
	 */
	
	public void  testUpdate() {
		// TODO Auto-generated method stub
		String sql = "UPDATE employees SET last_name = ? WHERE id = ?";
		jdbcTemplate.update(sql,"jack",5);
	}
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getClass());
	}

}
