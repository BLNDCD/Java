package equipoFutbol;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String viajar() {
		return nombre + " se encuentra viajando";

	}

	public String partido() {
		return nombre + " se encuentra en la cancha";
	}

	public String entrenamiento() {
		return nombre + " se encuentra en el predio";
	}
}
