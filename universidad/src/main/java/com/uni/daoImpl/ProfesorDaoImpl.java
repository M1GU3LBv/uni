package com.uni.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uni.dao.Todo;
import com.uni.entity.profesor;
@Component
public class ProfesorDaoImpl implements Todo<profesor>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<profesor> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p2.nombre,d.nombre as \"departamento\",id_departamento from profesor p \r\n"
				+ "inner join  persona p2 \r\n"
				+ "on p.id_profesor = p2.id \r\n"
				+ "inner join  departamento d \r\n"
				+ "on p.id_departamento  = d.id;\r\n"
				+ "", new BeanPropertyRowMapper<profesor>(profesor.class));
		
		
	}

	@Override
	public List<profesor> readAll1() {
		// TODO Auto-generated method stub
		return null;
	}

}
