package com.example.actividad.ventasFeign;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.actividad.producto;

@FeignClient(name = "productos" , url="http://localhost:8080/producto-controller")
public interface ventasFeignC {

	@GetMapping()
	public ArrayList<producto>ListaP();
}
