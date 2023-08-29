public class ResultadoEscolar {
  public static void main(String[] args) {
    //condicional composta
    int nota = 9;
    if(nota >= 7)
    System.out.println("Aprovado");
    else
    System.out.println("Reprovado");

    /******************/
    //condicional encadeada quando tem um terceira ou mais condições
    int nota2 = 6;

    if(nota2 >= 7)
    System.out.println("Aprovado");

    else if (nota2 >= 5 && nota2 < 7)//true ou false
    System.out.println("Prova de recuperação");

    else
    System.out.println("Reprovado");
    
    /***********************/
    //expressão ternária
    int nota3 = 4;

    String resultadonota3 = nota3 >= 7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
    System.out.println(resultadonota3);

  }
}
