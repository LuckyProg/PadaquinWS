package org.luckyprog.PadaquinWebService.Recursos;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.luckyprog.PadaquinWebService.Modelos.Pronostico;
import org.luckyprog.PadaquinWebService.Servicios.PronosticoServicio;

@Path("/pronosticos")
public class PronosticoRecurso {
	PronosticoServicio ps = new PronosticoServicio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getPartidos(){
		return "cheng";
	}
	
	@GET
	@Path("/{id_pronostico}")
	@Produces(MediaType.APPLICATION_XML)
	public Pronostico getPronostico(@PathParam("id_pronostico") int id_pronostico){
		//return ps.getPartido(id_partido);
		return ps.getPronostico(id_pronostico);
		//return ps.getPronostico(id_pronostico);
	}
	
	@GET
	@Path("/porusuario")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Pronostico> getPronosticos(@QueryParam("id_usuario") int id_usuario,@QueryParam("no_semana") int no_semana){
		return ps.getPronosticos(id_usuario, no_semana);
	}

}
