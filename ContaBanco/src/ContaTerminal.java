import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /*
        Link do projeto
        https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
    */
    
    public static void main(String[] args) throws Exception {
        
        /*  To Do
        * Conhece e importar a classe Scanner
        * Exibir as mensagens ao usuário 
        Obter pela classe Scanner os valores digitados pelo usuário via terminal
        */ 
;
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu usuário: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigador por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
