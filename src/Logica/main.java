package Logica;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Persistencia.Conn;

public class main {

	public static void AltaUsuario(int CI, int IDu, String nombre, String apellido, String mail, String password, TipoUsuario typeUser) {
		Conn connect = new Conn();
		Connection con = connect.conectarMySQL();
		Statement s1;
			if (typeUser == Estudiante) {
		try {
			s1 = con.createStatement();
			s1.executeUpdate("INSERT INTO estudiante(CI, IDu, nombre, apellido, mail, password) values ("+ CI + ", " +  "'" + IDu + "'" + ", " + nombre + ", " + "'" + apellido + "'" + mail +"'" + password + "'" + typeUser + "')" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		}
	}
}
