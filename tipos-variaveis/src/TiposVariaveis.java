public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        
        double salarioMinino = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        
        //aqui foi add cast
        //short numeroCurto = (short) numeroNormal;

        //aqui valor variavel numero foi reatribuido
        int numero = 1;
        numero = 2;
        System.out.println(numero);

        //mesmo estando a váriavel em caixa alta valor foi reatribuido
        double VALOR_DE_PI  = 3.14;
        VALOR_DE_PI = 10.75;
        System.out.println(VALOR_DE_PI);

        //por isso necessário usar palavra final para constante
        final double NOVO_VALOR_DE_PI = 3.14;
     

     }
}
