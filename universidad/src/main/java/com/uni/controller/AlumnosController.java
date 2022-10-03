package com.uni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uni.entity.Alumnos;
import com.uni.entity.profesor;
import com.uni.services.AlumnosService;
import com.uni.services.ProfesorService;

@RestController
@RequestMapping("/api")
public class AlumnosController {
	@Autowired
	private ProfesorService profesorservice;
	private AlumnosService alumnosservie;
	@GetMapping("/alumnos")
	public List<Alumnos> getList(){
		return alumnosservie.readAll();
	}
	@GetMapping("/alumnos1")
	public List<Alumnos> getList1(){
		return alumnosservie.readAll1();
	}
	@GetMapping("/profesor")
	public List<profesor> getList3(){
		return profesorservice.readAll();
	}


}
