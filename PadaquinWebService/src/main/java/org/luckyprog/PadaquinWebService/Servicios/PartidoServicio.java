package org.luckyprog.PadaquinWebService.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.luckyprog.PadaquinWebService.Modelos.Partido;
import org.luckyprog.PadaquinWebService.Utilidades.Conexion;

public class PartidoServicio {
	
	public ArrayList<Partido> getAllPartidos(){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<Partido> partidos = new ArrayList<Partido>();
		try{
			c = new Conexion().conectar();
			String query = "select p.id_partido, p.semana, p.mayoreal, p.menoreal, equipo.nombre_equipo as ganador,"
					+ " e1.nombre_equipo as local,p.local as id_local, e2.nombre_equipo as visitante, p.visitante as"
					+ " id_visitante, p.fecha, p.pr_mar from partido as p, equipo as e1, equipo as e2, equipo where "
					+ "p.local=e1.id_equipo and p.visitante=e2.id_equipo and p.ganadoreal=equipo.id_equipo  order by"
					+ " semana, fecha;";
			ps=c.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
                Partido partido = new Partido();
                partido.setId_partido(rs.getInt("id_partido"));
                partido.setSemana(rs.getInt("semana"));
                partido.setMayor(rs.getInt("mayoreal"));
                partido.setMenor(rs.getInt("menoreal"));
                partido.setGanador(rs.getString("ganador"));
                partido.setLocal(rs.getString("local"));
                partido.setId_local(rs.getInt("id_local"));
                partido.setVisitante(rs.getString("visitante"));
                partido.setId_visitante(rs.getInt("id_visitante"));
                partido.setFecha(rs.getString("fecha"));
                partido.setPrimer_marcador(rs.getInt("pr_mar"));
                partidos.add(partido);
            }
			return partidos;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public Partido getPartido(int id){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		Partido p = null;
		try{
			c = new Conexion().conectar();
			String query = "select p.id_partido, p.semana, p.mayoreal, p.menoreal, equipo.nombre_equipo as ganador,"
					+ " e1.nombre_equipo as local,p.local as id_local, e2.nombre_equipo as visitante, p.visitante as"
					+ " id_visitante, p.fecha, p.pr_mar from partido as p, equipo as e1, equipo as e2, equipo where "
					+ "p.local=e1.id_equipo and p.visitante=e2.id_equipo and p.ganadoreal=equipo.id_equipo and p.id_partido=?";
			ps=c.prepareStatement(query);
			ps.setInt(1, id);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
                p = new Partido(rs.getInt("id_partido"),rs.getInt("semana"),rs.getInt("mayoreal"),rs.getInt("menoreal"),rs.getString("ganador"),rs.getString("local"),rs.getInt("id_local"),rs.getString("visitante"),rs.getInt("id_visitante"),rs.getString("fecha"),rs.getInt("pr_mar"));
            }
			return p;			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
	
}
