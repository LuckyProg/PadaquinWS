package org.luckyprog.PadaquinWebService.Recursos;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import org.luckyprog.PadaquinWebService.Modelos.Liga;
import org.luckyprog.PadaquinWebService.Servicios.LigaServicio;

@Path("/ligas")
public class LigaRecurso {
	
	LigaServicio ls = new LigaServicio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getLigas(){
		return "cheng";
	}
	
	@GET
	@Path("/{no_liga}")
	@Produces(MediaType.APPLICATION_XML)
	public Liga getLiga(@PathParam("no_liga") int no_liga){
		return ls.getLiga(no_liga);
	}
}