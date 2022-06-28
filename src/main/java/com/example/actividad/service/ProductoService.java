package com.example.actividad.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.actividad.producto;
import com.example.actividad.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepository repositorioP;
	
	public List<producto> ListaProducto(){
		return (ArrayList<producto>) repositorioP.findAll();
	}
	
	public producto GuardaProducto(producto registroP) {
		return repositorioP.save(registroP);
	}
	
	public Optional<producto> ListaPID(Integer idp){
		return repositorioP.findById(idp);
	}
	
	public producto editarP(Integer idp, Integer pre) {
		Optional<producto> buscaP = this.repositorioP.findById(idp);
		if(buscaP.isPresent()) {
			producto nuevo = buscaP.get();
			nuevo.setPrepro(pre);
			return GuardaProducto(nuevo);
		}else {
		
			return null;
		}
		
	}
	
	public boolean eliminaP(Integer idp) {
		try {
			repositorioP.deleteById(idp);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
}
