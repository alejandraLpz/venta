package com.example.actividad.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actividad.producto;
import com.example.actividad.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	ProductoService servicioP;
	
	@GetMapping()
	public ArrayList<producto>ListaP(){
		return (ArrayList<producto>) servicioP.ListaProducto();
	}
	
	@PostMapping()
	public producto guardaP(@RequestBody producto nuevoRP) {
		return this.servicioP.GuardaProducto(nuevoRP);
	}
	
	@GetMapping("/{id}")
	public Optional<producto> buscaID(@PathVariable Integer idp){
		return servicioP.ListaPID(idp);
	}
	
	@PutMapping("/{id}")
	public producto editarP(@PathVariable Integer idp, @RequestBody Integer pre) {
		return servicioP.editarP(idp, pre);
	}
	
	@DeleteMapping("/{id}")
	public String eliminaP(@PathVariable Integer id) {
		boolean ok = this.servicioP.eliminaP(id);
		if(ok) {
			return "Registro eliminado";
		}else {
			return "Algo salió mal";
		}
	}
	
}
