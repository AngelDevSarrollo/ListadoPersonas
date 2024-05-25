public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }
    //Constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this();//con esto llamamos al constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
}
