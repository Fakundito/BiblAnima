package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Manejador {

	private ArrayList<Usuario> usuario;
	private ArrayList<Libro> libro;
	
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Libro> getLibro() {
		return libro;
	}
	public void setLibro(ArrayList<Libro> libro) {
		this.libro = libro;
	}
	

	private Manejador() {}

	private static final Manejador instance = new Manejador();

	public static Manejador getInstance() {
	    return instance;
	    
	}
	
	public void AltaUsuario(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario tipeUser, Orientacion orient) {
		Usuario user = new Usuario(id, CI, nombre, apellido, mail, password, tipeUser, orient);
		
	}
	    
	public Usuario consulta(int id) {
		return null;
	    	
	}
	
	public Usuario buscarUsuario(int id) {
		return null;
	    	
	}
	
	public void modificarDatosUsuario(String nombre, String apellido, String mail, String password) {
	    	
	}
	    
	public ArrayList<Usuario> ListarUsuariosExistentes() {
		return usuario;
	    	
	}
	    
	public void altaPrestamo(int id, int codigoISBN, Date fechaPres, Date fechaDev, boolean devuelto) {
	    	
	}
	    
	public ArrayList<Prestamo> consultarPrestamo(int idUsuario) {
		return null;
	    	
	}
	    
	public ArrayList<Prestamo> listarPrestamo() {
		return null;
		
	} 
	    
	public void altaLibro(int codigoISBN) {
	    	
	}
	    
	public ArrayList<Libro> listarLibros() {
		return libro;
	    	
	}
	    
	public void darDeBajaUnPrestamo() {
	    	
	}
}
