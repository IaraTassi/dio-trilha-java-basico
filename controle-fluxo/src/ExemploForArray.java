public class ExemploForArray {
  public static void main(String[] args) {
    //arrays indice inicia em zero
    //exemplo de for
    String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (int x=0; x<alunos.length; x++) {
      System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }

    /*****************/
    //exemplo de for each
    String alunos2 [] = { "GABRIEL", "ARTHUR", "JOÃO", "ARIEL" };

    for (String aluno : alunos2) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
