package org.luckyprog.PadaquinWebService.Modelos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
	
	private boolean sesion;
	private int id_usuario;
	private String nombre; 
	private String correo;
	private String correo_sec;
	private String apodo;
	private int survival;
	
	private String conferencia;
	private String region;
	private int jg;
	private int jp;
	private int je;
	private String divi;
	private String afc;
	private String nfc;
	private int pf;
	private int pc;
	
	
	
	public Usuario(){
		
	}

	
	
	public Usuario(boolean sesion, int id_usuario, String nombre, String correo, String correo_sec, String apodo,
			int survival) {
		this.sesion = sesion;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.correo_sec = correo_sec;
		this.apodo = apodo;
		this.survival = survival;
	}
	
	public Usuario(String conferencia, String region, int id_usuario, String nombre, int jg, int jp, int je,
			String divi, String afc, String nfc, int pf, int pc) {
		this.conferencia = conferencia;
		this.region = region;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.jg = jg;
		this.jp= jp;
		this.je= je;
		this.divi = divi;
		this.afc = afc;
		this.nfc = nfc;
		this.pf = pf;
		this.pc = pc;
	}
	
	

	public boolean isSesion() {
		return sesion;
	}


	public void setSesion(boolean sesion) {
		this.sesion = sesion;
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getCorreo_sec() {
		return correo_sec;
	}


	public void setCorreo_sec(String correo_sec) {
		this.correo_sec = correo_sec;
	}


	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public int getSurvival() {
		return survival;
	}


	public void setSurvival(int survival) {
		this.survival = survival;
	}



	public int getJg() {
		return jg;
	}



	public void setJg(int jg) {
		this.jg = jg;
	}



	public int getJp() {
		return jp;
	}



	public void setJp(int jp) {
		this.jp = jp;
	}



	public int getJe() {
		return je;
	}



	public void setJe(int je) {
		this.je = je;
	}



	public String getDivi() {
		return divi;
	}



	public void setDivi(String divi) {
		this.divi = divi;
	}



	public String getAfc() {
		return afc;
	}



	public void setAfc(String afc) {
		this.afc = afc;
	}



	public String getNfc() {
		return nfc;
	}



	public void setNfc(String nfc) {
		this.nfc = nfc;
	}



	public int getPf() {
		return pf;
	}



	public void setPf(int pf) {
		this.pf = pf;
	}



	public int getPc() {
		return pc;
	}



	public void setPc(int pc) {
		this.pc = pc;
	}



	public String getConferencia() {
		return conferencia;
	}



	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	
	
	
	
	
	

}
