public class Usuario {
  public static void main(String[] args) throws Exception{
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();//25 
    smartTv.diminuirVolume();//24
    smartTv.diminuirVolume();//23
    smartTv.aumentarVolume();//22
    System.out.println("Volume Atual : " + smartTv.volume);//23

    System.out.println("Canal Atual ? " + smartTv.canal);//1
    smartTv.mudarCanal(13);
    System.out.println("Canal Atual ? " + smartTv.canal);//13
    System.out.println("Volume Atual ? " + smartTv.volume);//23

    System.out.println("A TV ligada ? " + smartTv.ligada);
    System.out.println("Canal Atual ? " + smartTv.canal);
    System.out.println("Volume Atual ? " + smartTv.volume);

    smartTv.ligar ();
    System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

    smartTv.desligar ();
    System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

  }
   
  }

 