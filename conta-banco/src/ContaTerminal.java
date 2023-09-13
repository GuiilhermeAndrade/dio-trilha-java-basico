import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
     
     //Criando objeto Scanner para obter os valores digitados no terminal
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência!");
        String Agência = scanner.next();

        System.out.println("Por favor, digite o nome do responsável pela conta!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o sobrenome do responsável pela conta!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da sua conta!");
        Double saldoConta = scanner.nextDouble();

     scanner.close();
     
     //exibindo as informações para o usuário
     System.out.println("O número da sua conta é" + " " + numeroConta);
     System.out.println("O número da sua agência é" + " " + Agência);
     System.out.println("O nome do responsável pela conta é" + " " + nomeCliente + " " + sobrenomeCliente);
     System.out.println("O saldo da sua conta é" + " " + "R$" + saldoConta);
     
     //imprimindo a mensagem final de conta criada
    System.out.println("Olá" + " " + nomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é" + " "+ Agência + ", conta" + " " + numeroConta + " " + "e seu saldo de" + " " + "R$" + saldoConta + " " +"já está disponível para saque.");
     }
     
    }