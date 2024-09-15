import java.util.Scanner;

public class Conta {
    static Scanner scanner = new Scanner(System.in);
    public static void criarConta (){

        String nome,agencia;
        int conta;
        double saldo;


        System.out.println("Digite seu nome: ");
        nome=scanner.nextLine();

        System.out.println("Digite seu agencia: ");
        agencia=scanner.nextLine();

        System.out.println("Digite seu conta: ");
        conta=scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        saldo=scanner.nextDouble();

       Usuario user1 = new Usuario("","",0,0.0);

        user1.setNome(nome);
        user1.setAgencia(agencia);
        user1.setConta(conta);
        user1.setSaldo(saldo);

        System.out.println("nome do usuario: " + user1.getNome());
        System.out.println("nome da agencia: "+ user1.getAgencia());
        System.out.println("n° da conta: "+user1.getConta());
        System.out.println("seu saldo atual é: "+user1.getSaldo());





    }

}
