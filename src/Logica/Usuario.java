package Logica;

import java.util.ArrayList;

enum TipoUsuario{
	Estudiante,Profesor,Bibliotecario
}

public class Usuario {
	
	private int id;
	private int CI;
	private String nombre;
	private String apellido;
	private String mail;
	private String password;
	private TipoUsuario typeUser;
	private ArrayList<Prestamo> prestamo;

	public Usuario(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario typeUser, Orientacion orient) {
		super();
		this.id=id;
		this.CI=CI;
		this.nombre=nombre;
		this.apellido=apellido;
		this.mail=mail;
		this.password=password;
		this.typeUser=typeUser;
	}

	public ArrayList<Prestamo> getPrestamo() {
		return prestamo;
	}

	public TipoUsuario getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(TipoUsuario typeUser) {
		this.typeUser = typeUser;
	}

	public void setPrestamo(ArrayList<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
