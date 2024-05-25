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
    //El metodo get nos permite obtener el valor de un atributo
    public int getId(){
        return id;
    }
    //El metodo set nos permite modificar el valor de un atributo
    public void setId(int id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}'+ super.toString();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro Sanchez", "435 685 865", "pedro_sepulturero@gmail.com");
        System.out.println(persona1.toString());
    }
}
