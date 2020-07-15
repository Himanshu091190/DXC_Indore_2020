package com.dxc.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dxc.controller.beans.Employee;

public class EmployeeDAO {

	JdbcTemplate jdbcTemplate;

	public EmployeeDAO(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void saveOrUpdate(Employee employee) {
		if(employee.getId() > 0) {
			// Update
			String query = "UPDATE employee SET name=?, salary=?, designation=? WHERE id=?";
			jdbcTemplate.update(query, employee.getName(), employee.getSalary(),employee.getDesignation(),employee.getId());
		}
		else {
			// INSERT
			String query = "INSERT INTO employee (name, salary, designation) VALUES (?,?,?)";
			jdbcTemplate.update(query, employee.getName(), employee.getSalary(),employee.getDesignation());
		}
		
	}

	public void delete(int id) {
		String query = "DELETE FROM employee WHERE id=?";
		jdbcTemplate.update(query, id);
	}

	public List<Employee> list() {
		String query = "SELECT * FROM employee";
		List<Employee> mList = jdbcTemplate.query(query, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee mEmployee = new Employee();
				
				mEmployee.setId(rs.getInt("id"));
				mEmployee.setName(rs.getString("name"));
				mEmployee.setSalary(rs.getFloat("salary"));
				mEmployee.setDesignation(rs.getString("designation"));
				
				return mEmployee;
			}
			
		});
		return mList;
	}

	public Employee get(int id) {
		String query = "SELECT * FROM employee WHERE id="+id;
		return jdbcTemplate.query(query, new ResultSetExtractor<Employee>() {

			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt("id"));
					e.setName(rs.getString("name"));
					e.setSalary(rs.getFloat("salary"));
					e.setDesignation(rs.getString("designation"));
					return e;
				}
				return null;
			}
		});
	}
}
