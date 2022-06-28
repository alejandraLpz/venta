package com.example.actividad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.actividad.categoria;
import com.example.actividad.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repositorioC;
	
	public List<categoria> ListaCategoria(){
		return (ArrayList<categoria>) repositorioC.findAll();
	}
	
	public categoria GuardaCategoria(categoria registroC) {
		return repositorioC.save(registroC);
	}
	
	public Optional<categoria> ListaCID(Integer idc){
		return repositorioC.findById(idc);
	}
	
	public categoria editarCategoria(Integer idc, Integer det) {
		Optional<categoria> buscaP = this.repositorioC.findById(idc);
		if(buscaP.isPresent()) {
			categoria nuevo = buscaP.get();
			nuevo.setDetcat(det);
			return GuardaCategoria(nuevo);
		}else {
		
			return null;
		}
		
	}
	
	public boolean eliminaCategoria(Integer idc) {
		try {
			repositorioC.deleteById(idc);
			return true;
		}catch(Exception error) {
			return false;
		}
	}

}
