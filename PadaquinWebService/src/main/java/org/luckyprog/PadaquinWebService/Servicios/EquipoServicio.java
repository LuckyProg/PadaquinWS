package org.luckyprog.PadaquinWebService.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.luckyprog.PadaquinWebService.Modelos.Equipo;
import org.luckyprog.PadaquinWebService.Utilidades.Conexion;

public class EquipoServicio {
	
	public ArrayList<Equipo> getAllEquipos(){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		try{
			c = new Conexion().conectar();
			String query = "SELECT * FROM equipo";
			ps=c.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
                Equipo equi = new Equipo();
                equi.setId_equipo(rs.getInt("id_equipo"));
                equi.setNombre_equipo(rs.getString("nombre_equipo"));
                equi.setImagen(rs.getString("imagen"));
                equipos.add(equi);
            }
			return equipos;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
