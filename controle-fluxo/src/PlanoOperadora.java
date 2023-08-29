public class PlanoOperadora {
  public static void main(String[] args) {
    //O sistema terá 3 planos Basic, Midia, Turbo
    //Basic 100 min ligação
    //Midia 100 min ligação + Whats e Instagram grátis
    //Turbo 100 min ligação + Whats e Instagram grátis + 5GB Youtube
    String plano = "T";
    //condição switch case neste caso e a escolha ideal
    switch(plano) {
      case "T":{
        System.out.println("5Gb Youtube");
        break;
      }
      case "M":{
        System.out.println("Whats e Intagram grátis");
        break;
      }
      case "B":{
        System.out.println("100 minutos de ligação");
        break;
      }
      default: 
      System.out.println("Indefinodo");
}
  }
}
