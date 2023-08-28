public class Operadores {
  public static void main(String[] args) {
    //concatenação
    String nomeCompleto = "Linguagem " + "Java";
    System.out.println(nomeCompleto);

    String concatenacao = "?";

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);//31
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);//111
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);//1111
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);//31
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);//13

  
    int numero = 5;
    System.out.println(- numero);//-5
    System.out.println(numero);//5
    //neste caso ele não reatribuiu o numero negativo
    //para reatribuir preciso reatribuição na variavel
    numero = - numero;
    System.out.println(numero);//-5
    // para conveter para positivo
    numero = numero * -1;
    System.out.println(numero);//voltou a positivo 5

    //incrementos
    int numero2 = 5; 
    numero2 = numero2 + 2;
    System.out.println(numero2);//7
    //abreviando a representação a cima 
    int numero3 = 5; 
    System.out.println(numero3++);//5
    System.out.println(numero3);//6 pois ele incrementa após 

    int numero4 = 5; 
    System.out.println(++numero4);//6 incrementa antes 
    // podemos descrementar --numero exemplo

    boolean variavel = true;
    System.out.println(!variavel);//false em memoria
    System.out.println(variavel);//true até que atribua ela novamente

    variavel = !variavel;
    System.out.println(variavel);//agora ela e falsa por atribuição
    
    //operadoração sem ternário ?:
    int a, b;
    a = 5;
    b = 6;
    String resultado = " ";
    if(a==b)                                                
      resultado = "verdadeiro";
    else 
      resultado = "falso";  
    System.out.println(resultado);

    //com ternário primeira expressão sempre booleana
    int c, d;
    c = 5;
    d = 5;
    String resultado2 = c==d ? "verdadeiro" : "falso";
    System.out.println(resultado2);

    //opeadores relacionais que avalia uma condição
    int num1 = 1;
    int num2 = 2;

    if(num1 < num2) {
      System.out.println("A nossa condição é verdadeira");
    }
    boolean simNao = num1 == num2;
    System.out.println("numeroUm é igual a numeroDois? " +simNao);//false

    simNao = num1 != num2;
    System.out.println("numeroUm é diferente de numeroDois? " +simNao);//false

    simNao = num1 > num2;
    System.out.println("numeroUm é maior que numeroDois? " +simNao);//false

    String nomeUm = "Iara";
    String nomeDois = "Iara";
    System.out.println(nomeUm == nomeDois);//true
    // criando um novo objeto
    String nomeTres = "Iara";
    String nomeQuatro = new String ("Iara");
    System.out.println(nomeTres == nomeQuatro);//false por objeto ocupa outro espaço na memória
    System.out.println(nomeTres.equals(nomeQuatro));// true agora usando equals faz a comparação para objeto e texto true
    
    //operadores lógicos pode usar expressão relacional ou boolean
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2) {
      System.out.println("As duas condições são verdadeiras");// aqui teria que ser as duas verd para a expressaõ se verd
    }
    if(condicao1 || condicao2) {
      System.out.println("Uma das condições é verdadeira");//aqui como mostra o resultado e ver pois uma das condições e ver 
    }
  }

 
  
}
