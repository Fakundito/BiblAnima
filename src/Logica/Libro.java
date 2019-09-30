package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Libro {

	private String autor;
	private Date fechaPubli;
	private int nroEdicion;
	private String editorial;
	private String descripcion;
	private String cantEjemplares;
	private Boolean hayEjemplarDisponible;
	private int codigoISBN;
	private String genero;
	private String imagUrl;
	private ArrayList<Prestamo> prestamo;

	public Libro(String autor, Date fechaPubli, int nroEdicion, String editorial, String descripcion, 
			String cantEjemplares, boolean hayEjemplarDisponible, int codigoISBN, String genero, String imagUrl) {
		super();
		this.autor=autor;
		this.fechaPubli=fechaPubli;
		this.nroEdicion=nroEdicion;
		this.editorial=editorial;
		this.descripcion=descripcion;
		this.cantEjemplares=cantEjemplares;
		this.hayEjemplarDisponible=hayEjemplarDisponible;
		this.codigoISBN=codigoISBN;
		this.genero=genero;
		this.imagUrl=imagUrl;
		
	}

	public ArrayList<Prestamo> getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(ArrayList<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFechaPubli() {
		return fechaPubli;
	}

	public void setFechaPubli(Date fechaPubli) {
		this.fechaPubli = fechaPubli;
	}

	public int getNroEdicion() {
		return nroEdicion;
	}

	public void setNroEdicion(int nroEdicion) {
		this.nroEdicion = nroEdicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(String cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	public Boolean getHayEjemplarDisponible() {
		return hayEjemplarDisponible;
	}

	public void setHayEjemplarDisponible(Boolean hayEjemplarDisponible) {
		this.hayEjemplarDisponible = hayEjemplarDisponible;
	}

	public int getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(int codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImagUrl() {
		return imagUrl;
	}

	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}
	
}
