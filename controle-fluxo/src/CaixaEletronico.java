public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 26.0;

    //condicional simples
    if(valorSolicitado < saldo)
    saldo = saldo - valorSolicitado;
    System.out.println(saldo);

    //**********
    double saldo2 = 25.0;
    double valorSolicitado2 = 22.0;

    //condicional composta
    if(valorSolicitado2 < saldo2){
      saldo2 = saldo2 - valorSolicitado2;
      System.out.println("Novo Saldo" + saldo2);
    }else 
    System.out.println("Saldo insuficiente");
  }
}
