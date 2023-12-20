package equipoFutbol;

public class Test {
	public static void main(String[] args) {
		Persona listaPersonas[] = new Persona[3];
		listaPersonas[0] = new Futbolista("Lionel", "Messi", 36, "Delantero", 10);
		listaPersonas[1] = new Entrenador("Josep", "Guardiola", 52, "Posesion");
		listaPersonas[2] = new Doctor("Eric", "Da Silva", 65, "Especialista en Medicina Deportiva", 20);

		for (Persona persona : listaPersonas) {
			System.out.println(persona.entrenamiento());
			System.out.println(persona.viajar());
			System.out.println(persona.partido());
			if (persona instanceof Futbolista) {
				Futbolista futbolista = (Futbolista) persona;
				System.out.println(futbolista.entrevista());
			}
			if (persona instanceof Entrenador) {
				Entrenador entrenador = (Entrenador) persona;
				System.out.println(entrenador.planificarEncuentro());
			}
			if (persona instanceof Doctor) {
				Doctor doctor = (Doctor) persona;
				System.out.println(doctor.curarLesion());
			}

			Doctor doctor = new Doctor("Alejandro", "Barroso", 55, "Especialista en Medicina Deportiva", 15);
			for (Persona persona2 : listaPersonas) {
				if (persona2 instanceof Futbolista) {
					Futbolista futbolista = (Futbolista) persona2;
					System.out.println(doctor.curarLesion(futbolista));
				}
			}
		}
	}
}
