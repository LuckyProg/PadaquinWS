package org.luckyprog.PadaquinWebService.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.luckyprog.PadaquinWebService.Modelos.Usuario;
import org.luckyprog.PadaquinWebService.Utilidades.Conexion;

public class UsuarioServicio {
	
	public Usuario validarUsuario(String apodo, String pass){
		Connection c;
		PreparedStatement ps;
		ResultSet rs;
		Usuario usuario = null;
		try{
			c = new Conexion().conectar();
			String query = "select * from usuario where apodo = ? and pass = ?";
			ps=c.prepareStatement(query);
			ps.setString(1, apodo);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			if(rs.next()){
				usuario = new Usuario(true,rs.getInt("id_usuario"),rs.getString("nombre"), rs.getString("correo"), rs.getString("correo_secundario"),rs.getString("apodo"),rs.getInt("survival"));
            }else{
            	usuario = new Usuario(false,0,"","","","",0);
            	
            }
			return usuario;	
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public boolean editarUsuario(String nombre, String pass, String correo, String correo_sec, int id_usuario) throws SQLException{
        
		Connection c;
		PreparedStatement ps = null;
		Usuario usuario;
        
        try{
            usuario = new Usuario();
            c = new Conexion().conectar();
            String sql = "UPDATE usuario SET nombre=?, pass=?, correo=?, correo_secundario=? WHERE id_usuario=?";
            ps = c.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, pass);
            ps.setString(3, correo);
            ps.setString(4, correo_sec);
            ps.setInt(5, id_usuario);
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
            usuario = null;
        }
           ps.close();
           if(usuario==null){
           return true;
           }else{
           return false;
           }
        
    
    }

}
