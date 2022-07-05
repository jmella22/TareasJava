public class App {
  public static void main(String[] args) throws Exception {

    int resultado = suma(10 ,20,30);

    System.out.println(resultado);

    Coche miCoche = new Coche();

    miCoche.agregarpuerta();

    System.out.println(miCoche.puertas);
  }

  public static int suma (int a,int b, int c){
    return a + b + c;
  }

}

class Coche{
  public int puertas =0;

  public void agregarpuerta(){
    this.puertas++;
  }
}

