public class App {
  public static void main(String[] args) throws Exception {
    Cliente myCliente = new Cliente();

    myCliente.setEdad(32);
    myCliente.setNombre("jose");
    myCliente.setTelefono(123456789);
    myCliente.setCredito(true);

    System.out.println("La edad de mi cliente es: "+myCliente.getEdad());
    System.out.println("El nombre de mi cliente es: "+myCliente.getNombre());
    System.out.println("El telefono de mi cliente es: "+myCliente.getTelefono());
    System.out.println("¿El cliente califica para un credito?: "+myCliente.isCredito());

    Trabajador myTrabajador = new Trabajador();

    myTrabajador.setEdad(32);
    myTrabajador.setNombre("jose");
    myTrabajador.setTelefono(123456789);
    myTrabajador.setSalario(1500);

    System.out.println("La edad de mi trabajador es: "+myTrabajador.getEdad());
    System.out.println("El nombre de mi trabajador es: "+myTrabajador.getNombre());
    System.out.println("El telefono de mi trabajador es: "+myTrabajador.getTelefono());
    System.out.println("El salario de mi trabajador es: "+myTrabajador.getSalario());
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

class Cliente extends Persona{
  private boolean credito;

  public void setCredito(boolean credtio){
    this.credito = credtio;
  }
  public boolean isCredito(){
    return this.credito;
  }
}

class Trabajador extends Persona{
  private int salario;

  public void setSalario(int salario){
    this.salario = salario;
  }
  public int getSalario(){
    return this.salario;
  }
}