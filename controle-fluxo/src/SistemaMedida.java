public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "M";
  //condição encadeada
    if(sigla == "P")
    System.out.println("Pequeno");
    else if (sigla == "M")
    System.out.println("Médio");
    else if (sigla == "G")
    System.out.println("Grande");
    else
    System.out.println("Indefinido");

    /***************/
    //código refatorado para switch case
    //sem muito beneficio ao refatorar cuidado em escolher switch case
      String sigla2 = "P";
      //condição encadeado
      switch(sigla2) {
        case "P":{
          System.out.println("Pequeno");
          break;
        }
        case "M":{
          System.out.println("Médio");
          break;
        }
        case "G":{
          System.out.println("Grande");
          break;
        }
        default: 
        System.out.println("Indefinodo");
  }
  }
}
