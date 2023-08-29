import java.util.Random;
public class ExemploDoWhile {
  /*
   * Joãozinho reoslveu ligar para o seu amigo dizendo que hoje 
   * se entupiu de comer doces
   */
  public static void main(String[] args) {
    System.out.println("Dicando...");
    do{
      //executando repetidas vezes até alguém atender
      System.out.println("Telefone tocando");
    }while(tocando());
    System.out.println("Alô!");
    
  }
  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    //negando o ato de continua tocando
    return ! atendeu;
  }
}
