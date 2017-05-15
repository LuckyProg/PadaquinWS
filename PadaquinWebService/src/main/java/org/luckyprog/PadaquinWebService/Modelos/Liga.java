package org.luckyprog.PadaquinWebService.Modelos;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Liga {
	
	private int no_liga;
	private ArrayList<Usuario> usuarios;
	
	public Liga(){
		
	}

	public Liga(int no_liga) {
		this.no_liga = no_liga;
	}

	public int getNo_liga() {
		return no_liga;
	}

	public void setNo_liga(int no_liga) {
		this.no_liga = no_liga;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
