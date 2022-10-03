package com.uni.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uni.dao.Todo;
import com.uni.entity.Alumnos;
@Component
public class AlumnosDaoImpl implements Todo<Alumnos>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Alumnos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Alumnos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumnos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumnos> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.nombre, p.sexo, a.nombre as \"curso\" ,g.nombre as \"grado\" from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join persona p  \r\n"
				+ "on asma.id_alumno=  p.id  \r\n"
				+ "inner join asignatura a  \r\n"
				+ "on  asma.id_asignatura= a.id\r\n"
				+ "inner join grado g  \r\n"
				+ "on  a.id_grado  = g.id;", new BeanPropertyRowMapper<Alumnos>(Alumnos.class));
	}

	@Override
	public List<Alumnos> readAll1() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.nombre, ce.anyo_inicio from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join curso_escolar ce \r\n"
				+ "on ce.id = asma.id_curso_escolar \r\n"
				+ "inner join persona p  \r\n"
				+ "on asma.id_alumno=  p.id;", new BeanPropertyRowMapper<Alumnos>(Alumnos.class));
	}

}
