package edu.iara.segundasemana;
public class MinhaClasse {
  public static void main(String[] args) {
   String primeiroNome = "Iara";
   String segundoNome = "Tassi";

   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
   System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
  }

}