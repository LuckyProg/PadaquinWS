package org.luckyprog.PadaquinWebService.Modelos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Partido {
	
	private int id_partido;
	private int semana;
	private int mayor;
	private int menor;
	private String ganador;
	private String local;
	private int id_local;
	private String visitante;
	private int id_visitante;
	private String fecha;
	
	private int primer_marcador;
	
	public Partido(){
		
	}

	
	
	public Partido(int id_partido, int semana, String fecha, int id_visitante, String visitante, int id_local,
			String local) {
		this.id_partido = id_partido;
		this.semana = semana;
		this.fecha = fecha;
		this.id_visitante = id_visitante;
		this.visitante = visitante;
		this.id_local = id_local;
		this.local = local;
	}



	public Partido(int id_partido, int semana, int mayor, int menor, String ganador, String local, int id_local,
			String visitante, int id_visitante, String fecha, int primer_marcador) {
		this.id_partido = id_partido;
		this.semana = semana;
		this.mayor = mayor;
		this.menor = menor;
		this.ganador = ganador;
		this.local = local;
		this.id_local = id_local;
		this.visitante = visitante;
		this.id_visitante = id_visitante;
		this.fecha = fecha;
		this.primer_marcador = primer_marcador;
	}



	public int getId_partido() {
		return id_partido;
	}

	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}

	public int getMenor() {
		return menor;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getId_local() {
		return id_local;
	}

	public void setId_local(int id_local) {
		this.id_local = id_local;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public int getId_visitante() {
		return id_visitante;
	}

	public void setId_visitante(int id_visitante) {
		this.id_visitante = id_visitante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPrimer_marcador() {
		return primer_marcador;
	}

	public void setPrimer_marcador(int primer_marcador) {
		this.primer_marcador = primer_marcador;
	}
	
	

	
	
}
