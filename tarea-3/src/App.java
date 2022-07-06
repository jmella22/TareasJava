public class App {
  public static void main(String[] args) throws Exception {

    Persona myPersona = new Persona();

    myPersona.setEdad(32);
    myPersona.setNombre("Jose");
    myPersona.setTelefono(123456789);

    System.out.println("Mi edad es: "+myPersona.getEdad());
    System.out.println("Mi nombre es: "+myPersona.getNombre());
    System.out.println("Mi numero de telefono es: "+myPersona.getTelefono());
  }
}

class Persona{
  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad(int edad){
    this.edad = edad;
  }
  public int getEdad(){
    return this.edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }

  public void setTelefono(int telefono){
    this.telefono = telefono;
  }
  public int getTelefono(){
    return this.telefono;
  }

}