public class App {
    public static void main(String[] args) throws Exception {
        
        /* Ejercicio 4 */
        Persona persona = new Persona();

        /* Ejercicio 5 */
        persona.setEdad(31);
        persona.setNombre("Daniel");
        persona.setTelefono(600611622);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

/* Ejercicio 1 */
class Persona {
    /* Ejercicio 2 */
    private int edad;
    private String nombre;
    private int telefono;

    /* Ejercicio 3 */
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}
