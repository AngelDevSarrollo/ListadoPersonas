import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion: ");
    }
    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada
        switch (opcion){
            case 1 ->{//Agregar Persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Crea el objeto persona
                var persona = new Persona(nombre, telefono, email);
                //Lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + "elementos");
            }//fin caso 1
            case 2 ->{//Listar personas
                System.out.println("Listado de personas: ");
                //Mejora usando lambda y metodo de referencia
                //personas.forEach((persona -> System.out.println(persona)));
                personas.forEach(System.out::println);
            }
            case 3 -> {//Salir del ciclo
                System.out.println("Hasta pronto...");
                salir = true;

            }
            default -> System.out.println("Opcion Erronea: " + opcion);
        }//Fin switch
        return salir;

    }
}