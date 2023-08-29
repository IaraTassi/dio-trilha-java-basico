import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // String nome = args [0];
    // String sobrenome = args [1];
    // int idade = Integer.valueOf(args[2]);
    // double altura = Double.valueOf(args[3]);

   // System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade  + " anos ");
        // System.out.println("Minha altura é " + altura + "cm ");
        //criando objeto scanner

        //vamos adicionar alguns possíveis erros 
        //não informar nome e sobrenome
        //valor de idade não ter caracter numérico
        //valor da aktura ter um virgula ao invês de ser um ponto(conforme padrão americano)
      try{
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        
     System.out.println("Digite seu nome");
     String nome = scanner.next();
    
     System.out.println("Digite seu sobrenome");
     String sobrenome = scanner.next();

     System.out.println("Digite sua idade");
     int idade = scanner.nextInt();
     
     System.out.println("Digite sua altura");
     double altura = scanner.nextDouble();
    //imprimindo os dados obtidos pelo usuário
    System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é  " + altura + "cm ");
    scanner.close();
    }catch(InputMismatchException e) {
      System.out.println("Os campos idade e altura precisam ser númericos");
    }
  }
}
