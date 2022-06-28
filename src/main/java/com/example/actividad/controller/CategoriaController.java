package com.example.actividad.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actividad.categoria;
import com.example.actividad.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	CategoriaService servicioC;
	
	@GetMapping()
	public ArrayList<categoria>ListaC(){
		return (ArrayList<categoria>) servicioC.ListaCategoria();
	}
	
	@PostMapping()
	public categoria guardaC(@RequestBody categoria nuevoRC) {
		return this.servicioC.GuardaCategoria(nuevoRC);
	}
	
	@GetMapping("/{id}")
	public Optional<categoria> buscaID(@PathVariable Integer idc){
		return servicioC.ListaCID(idc);
	}
	
	@PutMapping("/{id}")
	public categoria editarP(@PathVariable Integer idc, @RequestBody Integer det) {
		return servicioC.editarCategoria(idc, det);
	}
	
	@DeleteMapping("/{id}")
	public String eliminaP(@PathVariable Integer id) {
		boolean ok = this.servicioC.eliminaCategoria(id);
		if(ok) {
			return "Registro eliminado";
		}else {
			return "Algo salió mal";
		}
	}
}
