import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu primeiro nome:");
            String nome = scanner.next();
        System.out.println("Agora, o seu sobrenome:");
            String sobrenome = scanner.next();
        System.out.println("Informe o número da sua conta:");
            int conta = scanner.nextInt();
        System.out.println("Agora digite o número da agência:");
            String agencia = scanner.next();
        System.out.println("Por fim, informe o valor do seu saldo:");
            double saldo = scanner.nextDouble();

            
        System.out.println("Olá, " + nome + " " + sobrenome + "! " + "Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }


}
