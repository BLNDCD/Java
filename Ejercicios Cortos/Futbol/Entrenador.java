package equipoFutbol;

public class Entrenador extends Persona {
	private String estrategia;

	public Entrenador(String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	@Override
	public String viajar() {
		return super.viajar() + " y repasando tacticas";

	}

	@Override
	public String partido() {
		return super.partido() + " dirigiendo al equipo";
	}

	@Override
	public String entrenamiento() {
		return super.entrenamiento() + " dirigiendo el entrenamiento";
	}

	public String planificarEncuentro() {
		return this.getNombre() + " esta definiendo la alineacion inicial";
	}
}
