package org.luckyprog.PadaquinWebService.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.luckyprog.PadaquinWebService.Modelos.Partido;
import org.luckyprog.PadaquinWebService.Modelos.Pronostico;
import org.luckyprog.PadaquinWebService.Utilidades.Conexion;

public class PronosticoServicio {

	public Pronostico getPronostico(int id){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		Pronostico pronostico = new Pronostico();
		try{
			c = new Conexion().conectar();
			String query = "select pr.id_pronostico, p.id_partido, p.fecha,p.semana, p.pr_mar, v.id_equipo as id_visitante,"
					+ "v.nombre_equipo as visitante, v.imagen as imagenvis, l.id_equipo as id_local, l.nombre_equipo as local,"
					+ "l.imagen as imagenloc,pr.ganador as id_ganador,e.nombre_equipo, pr.mayor, pr.menor, pr.acierto,"
					+ "pr.no_marcador from partido as p, equipo as v, equipo as l, equipo as e, pronostico as pr "
					+ "where p.local=l.id_equipo and p.visitante=v.id_equipo and pr.id_partido = p.id_partido and "
					+ "e.id_equipo = pr.ganador and pr.id_pronostico = ? order by p.id_partido";
			ps=c.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
				pronostico.setPartido(new Partido(
						rs.getInt("id_partido"),
						rs.getInt("semana"),
						rs.getString("fecha"),
						rs.getInt("id_visitante"),
						rs.getString("visitante"),
						rs.getInt("id_local"),
						rs.getString("local")));
				pronostico.setId_pronostico(rs.getInt("id_pronostico"));
				pronostico.setPr_marcador(rs.getInt("pr_mar"));
				pronostico.setId_ganador(rs.getInt("id_ganador"));
				pronostico.setGanador(rs.getString("nombre_equipo"));
                
            }
			return pronostico;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
		
		public ArrayList<Pronostico> getPronosticos(int id_usuario, int no_semana){
			Connection c;
			PreparedStatement ps;
			ResultSet rs;
			ArrayList<Pronostico> pronosticos = new ArrayList<Pronostico>();
			try{
				c = new Conexion().conectar();
				String query = "select pr.id_pronostico, p.id_partido, p.fecha,p.semana, p.pr_mar, v.id_equipo as id_visitante,"
						+ "v.nombre_equipo as visitante, v.imagen as imagenvis, l.id_equipo as id_local, l.nombre_equipo as local,"
						+ "l.imagen as imagenloc,pr.ganador as id_ganador,e.nombre_equipo, pr.mayor, pr.menor, pr.acierto,"
						+ "pr.no_marcador from partido as p, equipo as v, equipo as l, equipo as e, pronostico as pr "
						+ "where p.local=l.id_equipo and p.visitante=v.id_equipo and pr.id_partido = p.id_partido and "
						+ "e.id_equipo = pr.ganador and pr.id_usuario = ? and p.semana = ? order by p.fecha";
				ps=c.prepareStatement(query);
				ps.setInt(1, id_usuario);
				ps.setInt(2, no_semana);
				rs=ps.executeQuery();
				while(rs.next()){
					Pronostico pronostico = new Pronostico();
					pronostico.setPartido(new Partido(
							rs.getInt("id_partido"),
							rs.getInt("semana"),
							rs.getString("fecha"),
							rs.getInt("id_visitante"),
							rs.getString("visitante"),
							rs.getInt("id_local"),
							rs.getString("local")));
					pronostico.setId_pronostico(rs.getInt("id_pronostico"));
					pronostico.setPr_marcador(rs.getInt("pr_mar"));
					pronostico.setId_ganador(rs.getInt("id_ganador"));
					pronostico.setGanador(rs.getString("nombre_equipo"));
					pronosticos.add(pronostico);
	                
	            }
				return pronosticos;			
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
	
}
