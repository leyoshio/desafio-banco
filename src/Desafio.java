import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeDoCliente = "Madoc Prado-Sábio";
        String tipoConta = "Corrente";
        double saldoDaConta = 2483.29;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Dados do cliente");
        System.out.println("\nNome do cliente: " + nomeDoCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoDaConta);
        System.out.println("***********************");

        String menu = """
                Operações
                
                1 - Consultar saldoDaConta
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Escolha uma operação:              
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("\nO saldoDaConta atualizado é " + saldoDaConta);
            } else if (opcao == 2) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldoDaConta += valor;
                System.out.println("\nNovo saldoDaConta: " + saldoDaConta);
            } else if (opcao == 3) {
                System.out.println("\nQual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldoDaConta) {
                    System.out.println("\nNão há saldoDaConta suficiente.");
                } else {
                    saldoDaConta -= valor;
                    System.out.println("\nNovo saldoDaConta: " + saldoDaConta);
                }
            } else if (opcao != 4) {
                System.out.println("\nOpção inválida!");
            }
        }
    }
}
