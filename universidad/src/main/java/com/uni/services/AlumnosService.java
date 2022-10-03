package com.uni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uni.dao.Todo;
import com.uni.daoImpl.AlumnosDaoImpl;
import com.uni.entity.Alumnos;

@Service
public class AlumnosService implements Todo<Alumnos>{
	
	@Autowired
	private AlumnosDaoImpl daoIMpl;

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
		return daoIMpl.readAll();
	}

	@Override
	public List<Alumnos> readAll1() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll1();
	}
	

	

}
