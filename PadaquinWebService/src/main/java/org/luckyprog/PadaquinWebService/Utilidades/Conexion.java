package org.luckyprog.PadaquinWebService.Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private Connection conexion;
	
	
	public Connection conectar(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/quinie";
            String usuario="root";
            String clave="n0m3l0";
            conexion = DriverManager.getConnection(url,usuario,clave);
            return conexion;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
