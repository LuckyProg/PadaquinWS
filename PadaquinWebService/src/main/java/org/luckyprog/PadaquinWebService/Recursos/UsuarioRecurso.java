package org.luckyprog.PadaquinWebService.Recursos;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.luckyprog.PadaquinWebService.Modelos.Usuario;
import org.luckyprog.PadaquinWebService.Servicios.UsuarioServicio;

@Path("/usuarios")
public class UsuarioRecurso {
	UsuarioServicio us = new UsuarioServicio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getPartidos(){
		return "cheng";
	}
	
	@GET
	@Path("/validar")
	@Produces(MediaType.APPLICATION_XML)
	public Usuario validarUsuario(@QueryParam("apodo") String apodo,@QueryParam("pass") String pass ){
		Usuario usu = us.validarUsuario(apodo, pass);
		return usu;
	}
	
	@PUT
	@Path("/actualizar")
	public String changeUsuario(@QueryParam("nombre") String nombre,
			@QueryParam("pass") String pass, @QueryParam("correo") String correo,@QueryParam("correo_sec") String correo_sec,@QueryParam("id_usuario") int id_usuario) throws SQLException{
		
		if(!us.editarUsuario(nombre,pass,correo,correo_sec,id_usuario)){
			return "true";
		}else{
			return "false";
		}
	}
	

}