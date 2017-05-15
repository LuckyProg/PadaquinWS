package org.luckyprog.PadaquinWebService.Recursos;

import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import org.luckyprog.PadaquinWebService.Modelos.Partido;
import org.luckyprog.PadaquinWebService.Servicios.PartidoServicio;

@Path("/partidos")
public class PartidoRecurso {
	
	PartidoServicio ps = new PartidoServicio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Partido> getPartidos(){
		return ps.getAllPartidos();
	}
	
	@GET
	@Path("/{id_partido}")
	@Produces(MediaType.APPLICATION_XML)
	public Partido getPartido(@PathParam("id_partido") int id_partido){
		return ps.getPartido(id_partido);
	}

}
