package org.luckyprog.PadaquinWebService.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.luckyprog.PadaquinWebService.Modelos.Liga;
import org.luckyprog.PadaquinWebService.Modelos.Usuario;
import org.luckyprog.PadaquinWebService.Utilidades.Conexion;

public class LigaServicio {

	public Liga getLiga(int no_liga){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		Liga liga = new Liga();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			c = new Conexion().conectar();
			String query = "select l.no_liga,l.conferencia,l.region,u.id_usuario,u.nombre,"
					+ "l.jg,l.jp,l.je,l.divi,l.afc,l.nfc,l.pf,l.pc  from liga as l,"
					+ " usuario as u where u.id_usuario=l.id_usuario and no_liga = ? order by no_liga,"
					+ " conferencia, region";
			ps=c.prepareStatement(query);
			ps.setInt(1, no_liga);
			rs=ps.executeQuery();
			while(rs.next()){
				usuarios.add(new Usuario(rs.getString("conferencia"),
						rs.getString("region"),
						rs.getInt("id_usuario"),
						rs.getString("nombre"),
						rs.getInt("jg"),
						rs.getInt("jp"),
						rs.getInt("je"),
						rs.getString("divi"),
						rs.getString("afc"),
						rs.getString("nfc"),
						rs.getInt("pf"),
						rs.getInt("pc")));
            }
			liga.setNo_liga(no_liga);
			liga.setUsuarios(usuarios);
			return liga;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
