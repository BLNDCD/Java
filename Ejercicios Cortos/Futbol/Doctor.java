package equipoFutbol;

public class Doctor extends Persona {
	private String titulacion;
	private int experencia;

	public Doctor(String nombre, String apellido, int edad, String titulacion, int experencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.experencia = experencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getExperencia() {
		return experencia;
	}

	@Override
	public String viajar() {
		return super.viajar() + " con el equipo";

	}

	@Override
	public String partido() {
		return super.partido() + " atendiendo a un jugador";
	}

	@Override
	public String entrenamiento() {
		return super.entrenamiento() + " supervisando a los jugadores";
	}

	public String curarLesion() {
		return this.getNombre() + " Esta tratando la lesion de un futbolista ";
	}

	public String curarLesion(Futbolista f) {
		return this.getNombre() + " Esta tratando la lesion de " + f.getNombre() + " " + f.getApellido();
	}
}
