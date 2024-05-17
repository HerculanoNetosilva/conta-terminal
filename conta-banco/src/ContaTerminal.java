import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR")); //convertendo localidade para portugês do Brasil
        System.out.println("Bem vindo ao Banco da DIO");
       
        //Solicitando o nome do usuário
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        //Solicitando a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        
        //Solicitando o número da conta
        System.out.println("Digite o número da Conta: ");
        int conta = scanner.nextInt();
        
        //Solicitando o Saldo da conta
        System.out.println("Digite seu Saldo:");
        double saldo = scanner.nextDouble();

        // Criar um NumberFormat para a localidade brasileira
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        
        // Formatar o saldo
        String saldoFormatado = formatter.format(saldo);
        
        //Exibindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldoFormatado + " já está disponível para saque" );
        
    }
}
