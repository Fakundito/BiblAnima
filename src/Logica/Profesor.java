package Logica;

enum Orientacion{
	TIC,ADM,ADMandTIC
}

public class Profesor extends Usuario{

	private Orientacion orient;
	
	public Profesor(int id, int CI, String nombre, String apellido, String mail, String password, TipoUsuario typeUser, Orientacion orient) {
		super(id, CI, nombre, apellido, mail, password, typeUser, orient);
		this.orient=orient;
	}

}
