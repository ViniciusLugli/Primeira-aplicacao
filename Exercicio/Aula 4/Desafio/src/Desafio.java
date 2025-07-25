import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        double saldo = 2500;
        double receber = 0;
        double transferir = 0;
        String nome = "Vinícius Lugli";
        String conta = "Corrente";

        String operacoes = """
                Operações
                
                1. Consultar saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """;

        while (escolha != 4){

            System.out.println("****************************************************");
            System.out.println("Nome:                       " + nome);
            System.out.println("Tipo conta                  " + conta);
            System.out.println("Saldo:                      " + saldo);
            System.out.println("****************************************************");
            System.out.println(operacoes);
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("O seu saldo é de " + saldo);
            } else if (escolha == 2) {
                System.out.println("Qual o valor que vai receber?");
                receber = scanner.nextDouble();
                saldo += receber;

            } else if (escolha == 3) {
                System.out.println("Qual o valor que deseja transferir?");
                transferir = scanner.nextDouble();
                saldo -= transferir;
            } else if (escolha == 4) {
                System.out.println("Programa encerrado");
                break;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }

    }
}
