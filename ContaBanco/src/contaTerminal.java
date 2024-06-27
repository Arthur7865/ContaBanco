import java.util.*;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
    

Scanner scanner = new Scanner(System.in);

System.out.println("Por favor, digite o número da conta: ");
int numeroDaConta = scanner.nextInt();

System.out.println("Digite o número da sua agência: ");
String agencia = scanner.nextLine(); 

System.out.println("Digite seu nome: ");
String nomeCliente = scanner.nextLine();  

System.out.println("Digite o valor do seu saldo: ");
double saldo = scanner.nextDouble(); 

scanner.close();

System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é: %s, conta %d e seu saldo é de R$%.2f já está disponível para saque. %n ", nomeCliente, agencia, numeroDaConta, saldo);




















    }
}


