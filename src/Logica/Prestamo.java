package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {

	private int id;
	private Date fechaSolicitado;
	private Date fechaDevolucion;
	private Boolean devuelto;
	
	Notificacion[] notificacion = new Notificacion[3];
	
	public Prestamo(int id, Date fechaSolicitado, Date fechaDevolucion, boolean devuelto) {
		super();
		this.id=id;
		this.fechaSolicitado=fechaSolicitado;
		this.fechaDevolucion=fechaDevolucion;
		this.devuelto=devuelto;
	}

	public Notificacion[] getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion[] notificacion) {
		this.notificacion = notificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaSolicitado() {
		return fechaSolicitado;
	}

	public void setFechaSolicitado(Date fechaSolicitado) {
		this.fechaSolicitado = fechaSolicitado;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Boolean getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(Boolean devuelto) {
		this.devuelto = devuelto;
	}
	
}
