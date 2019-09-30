package Logica;

enum Orientacion1{
	TIC,ADM,ADMandTIC
}

public class Estudiante extends Usuario{

	private Orientacion orient;
	
	public Estudiante(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario typeUser, Orientacion orient) {
		super(id, CI, nombre, apellido, mail, password, typeUser, orient);
		this.orient=orient;
	}

}