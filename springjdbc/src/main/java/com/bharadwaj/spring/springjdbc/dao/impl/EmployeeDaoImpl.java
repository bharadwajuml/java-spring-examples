package com.bharadwaj.spring.springjdbc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bharadwaj.spring.springjdbc.dao.EmployeeDao;
import com.bharadwaj.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee_info values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

}
