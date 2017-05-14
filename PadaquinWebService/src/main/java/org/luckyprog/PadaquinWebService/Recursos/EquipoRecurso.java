package org.luckyprog.PadaquinWebService.Recursos;

import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import org.luckyprog.PadaquinWebService.Modelos.Equipo;
import org.luckyprog.PadaquinWebService.Servicios.EquipoServicio;

@Path("/equipos")
public class EquipoRecurso {
	
	EquipoServicio es = new EquipoServicio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Equipo> getEquipos(){
		return es.getAllEquipos();
	}
}