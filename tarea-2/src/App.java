
public class App {
  public static void main(String[] args) throws Exception {
    int numberIf = 14;
    funcIF(numberIf);

    int numberWhile = 0;
    funcWhile(numberWhile);

    int numberDoWhile = 3;
    funcDoWhile(numberDoWhile);

    int numberFor=0;
    funcFor(numberFor);

    String estacion="invierno";
    funcSwith(estacion);

  }

  public static void funcIF (int a){
    if(a < 0){
      System.out.println("el numero es menor a 0");
    } else if (a>0){
      System.out.println("el numero es mayor a 0");
    }else{
      System.out.println("el numero es 0");
    }
  }

  public static void funcWhile(int a){
    while (a < 3){
      System.out.println(a);
      a++;
    }
  }

  public static void funcDoWhile(int a){
    do{
      System.out.println(a);
      a++;
    }while (a < 3);
  }

  public static void funcFor(int a){
    for (int i = a; i <= 3; i++){
      System.out.println(i);
    }
  }

  public static void funcSwith(String a){
    switch(a){
      case "verano":
      System.out.println("estamos en verano");
      break;
      case "primavera":
      System.out.println("estamos en primavera");
      break;
      case "invierno":
      System.out.println("estamos en invierno");
      break;
      case "otoño":
      System.out.println("estamos en otoño");
      break;
      default:
      System.out.println("no es una estacion valida");
    }
  }
}
