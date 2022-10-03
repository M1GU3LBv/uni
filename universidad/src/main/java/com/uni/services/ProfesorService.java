package com.uni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.Todo;
import com.uni.daoImpl.ProfesorDaoImpl;
import com.uni.entity.profesor;
@Service
public class ProfesorService implements Todo<profesor>{
@Autowired
	private ProfesorDaoImpl daoIMpl;
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
		return daoIMpl.readAll();
	}

	@Override
	public List<profesor> readAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
