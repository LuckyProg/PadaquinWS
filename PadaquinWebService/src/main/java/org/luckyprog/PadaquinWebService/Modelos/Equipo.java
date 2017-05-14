package org.luckyprog.PadaquinWebService.Modelos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Equipo {
	
	private int id_equipo;
	private String nombre_equipo;
	private String imagen;
	
	public Equipo(){
		
	}
	
	public Equipo(int id_equipo, String nombre_equipo, String imagen){
		this.id_equipo = id_equipo;		
		this.nombre_equipo= nombre_equipo;		
		this.imagen = imagen;		
	}
	
	public int getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}
