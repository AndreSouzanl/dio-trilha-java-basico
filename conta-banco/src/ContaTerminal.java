import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite seu nome completo: ");
            String nome = scanner.nextLine();
            
            System.out.println("Por favor, digite seu numero da conta: ");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da sua agência: ");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite o saldo da conta: ");
            double saldo = scanner.nextDouble();
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, numeroConta, saldo);
        }    
        }
    }

