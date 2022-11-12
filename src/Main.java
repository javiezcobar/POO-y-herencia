public class Main {
    public static void main(String[] args) {
    Persona Persona1 = new Persona();
    Persona1.setEdad(2);
    Persona1.setNombre("Elizabeth");
    Persona1.setTelefono(1122332233);

        System.out.println(Persona1.getNombre());
        System.out.println(Persona1.getEdad());
        System.out.println(Persona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getNombre(){
        return nombre;
    }


}