package com.example.actividad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actividad.producto;
import com.example.actividad.ventasFeign.ventasFeignC;

@RestController
@RequestMapping("/venta")
public class ventaController {

	@Autowired
	private ventasFeignC ventasFC;
	
	@GetMapping("/productos")
	public List<producto>ListaP(){
		return ventasFC.ListaP();
	}
}
