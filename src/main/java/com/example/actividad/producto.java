package com.example.actividad;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")

@Data
public class producto {
    @Id
    @Column(unique = true, nullable = false)
    Integer idpro;
    Integer nompro;
    Integer carpro;
    Integer prepro;
    
	public Integer getIdpro() {
		return idpro;
	}
	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}
	public Integer getNompro() {
		return nompro;
	}
	public void setNompro(Integer nompro) {
		this.nompro = nompro;
	}
	public Integer getCarpro() {
		return carpro;
	}
	public void setCarpro(Integer carpro) {
		this.carpro = carpro;
	}
	public Integer getPrepro() {
		return prepro;
	}
	public void setPrepro(Integer prepro) {
		this.prepro = prepro;
	}
    
    
    
    
}
