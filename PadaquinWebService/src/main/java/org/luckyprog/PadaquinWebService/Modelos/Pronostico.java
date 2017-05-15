package org.luckyprog.PadaquinWebService.Modelos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pronostico {

	private int id_pronostico;
	private int pr_marcador;
	private int id_ganador;
	private String ganador;
	private int mayor;
	private int menor;
	private boolean acierto;
	private int no_marcador;
	
	private Partido partido;
		
	public Pronostico(){
		
	}

	
	
	public Pronostico(int id_pronostico, int pr_marcador, int id_ganador, String ganador, int mayor, int menor,
			boolean acierto, int no_marcador, Partido partido) {
		this.id_pronostico = id_pronostico;
		this.pr_marcador = pr_marcador;
		this.id_ganador = id_ganador;
		this.ganador = ganador;
		this.mayor = mayor;
		this.menor = menor;
		this.acierto = acierto;
		this.no_marcador = no_marcador;
		this.partido = partido;
	}



	public int getId_pronostico() {
		return id_pronostico;
	}

	public void setId_pronostico(int id_pronostico) {
		this.id_pronostico = id_pronostico;
	}

	public int getPr_marcador() {
		return pr_marcador;
	}

	public void setPr_marcador(int pr_marcador) {
		this.pr_marcador = pr_marcador;
	}

	public int getId_ganador() {
		return id_ganador;
	}

	public void setId_ganador(int id_ganador) {
		this.id_ganador = id_ganador;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
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

	public boolean isAcierto() {
		return acierto;
	}

	public void setAcierto(boolean acierto) {
		this.acierto = acierto;
	}

	public int getNo_marcador() {
		return no_marcador;
	}

	public void setNo_marcador(int no_marcador) {
		this.no_marcador = no_marcador;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	



	
	
	
	
	
}
