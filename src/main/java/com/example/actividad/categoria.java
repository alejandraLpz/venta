package com.example.actividad;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria")

@Data
public class categoria {
	@Id
    @Column(unique = true, nullable = false)
    int idcat;
    Integer nomcat;
    Integer detcat;
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(Integer idcat) {
		this.idcat = idcat;
	}
	public Integer getNomcat() {
		return nomcat;
	}
	public void setNomcat(Integer nomcat) {
		this.nomcat = nomcat;
	}
	public Integer getDetcat() {
		return detcat;
	}
	public void setDetcat(Integer detcat) {
		this.detcat = detcat;
	}
    
    
}
