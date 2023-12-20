package equipoFutbol;

public class Futbolista extends Persona {
	private String posicion;
	private int dorsal;

	public Futbolista(String nombre, String apellido, int edad, String posicion, int dorsal) {
		super(nombre, apellido, edad);
		this.posicion = posicion;
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	@Override
	public String viajar() {
		return super.viajar() + " con los demas jugadores";

	}

	@Override
	public String partido() {
		return super.partido() + " jugando con el equipo";
	}

	@Override
	public String entrenamiento() {
		return super.entrenamiento() + " entrenando";
	}

	public String entrevista() {
		return this.getNombre() + " esta dando una entrevista";
	}

}
