package Logica;

enum Orientacion1{
	TIC,ADM,ADMandTIC
}

public class Estudiante extends Usuario{

	private Orientacion orient;
	private int tope;
	
	public Estudiante(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario typeUser, Orientacion orient, int tope) {
		super(id, CI, nombre, apellido, mail, password, typeUser, orient);
		this.setOrient(orient);
		this.setTope(tope);
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public Orientacion getOrient() {
		return orient;
	}

	public void setOrient(Orientacion orient) {
		this.orient = orient;
	}

}