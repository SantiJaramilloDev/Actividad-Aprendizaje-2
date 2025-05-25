import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static List<Persona> capturarPersonas(int cantidad) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese el género (Masculino/Femenino):");
            String genero = scanner.nextLine();

            System.out.println("Ingrese la edad:");
            int edad = Integer.parseInt(scanner.nextLine());

            personas.add(new Persona(nombre, apellido, genero, edad));
        }

        return personas;
    }

    public static void mostrarNombreYGenero(List<Persona> personas) {
        System.out.println("Nombre y Género de las personas:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getGenero());
        }
    }
}