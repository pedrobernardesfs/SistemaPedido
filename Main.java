import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produto> catalogo = new ArrayList<>();
        catalogo.add(new Produto("Notebook Dell",      4500.00));
        catalogo.add(new Produto("Mouse Wireless",       89.90));
        catalogo.add(new Produto("Mochila Executiva",   159.90));
        catalogo.add(new Produto("Teclado Mecânico",    349.90));
        catalogo.add(new Produto("Monitor 24\"",       1299.00));

        System.out.println("   SISTEMA DE GESTÃO DE PEDIDOS");

        System.out.print("Nome do cliente : ");
        String nome = scanner.nextLine();

        System.out.print("E-mail          : ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email);

        System.out.print("Número do pedido: ");
        int numeroPedido = lerInteiroPositivo(scanner);

        Pedido pedido = new Pedido(numeroPedido, LocalDate.now(), cliente);

        boolean adicionando = true;

        while (adicionando) {
            System.out.println("\n--- Produtos disponíveis ---");
            for (int i = 0; i < catalogo.size(); i++) {
                System.out.printf("[%d] %s%n", i + 1, catalogo.get(i));
            }
            System.out.println("[0] Finalizar pedido");
            System.out.print("Escolha um produto: ");

            int opcao = lerInteiro(scanner);

            if (opcao == 0) {
                if (pedido.getItens().isEmpty()) {
                    System.out.println("Adicione pelo menos um produto antes de finalizar.");
                } else {
                    adicionando = false;
                }
            } else if (opcao >= 1 && opcao <= catalogo.size()) {
                Produto produtoEscolhido = catalogo.get(opcao - 1);

                System.out.printf("Quantidade de \"%s\": ", produtoEscolhido.getNome());
                int quantidade = lerInteiroPositivo(scanner);

                pedido.adicionarItem(new ItemPedido(quantidade, produtoEscolhido));
                System.out.printf("✔ %dx %s adicionado(s) ao pedido.%n",
                        quantidade, produtoEscolhido.getNome());
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println();
        pedido.exibirResumo();

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número: ");
            }
        }
    }
    private static int lerInteiroPositivo(Scanner scanner) {
        while (true) {
            int valor = lerInteiro(scanner);
            if (valor >= 1) return valor;
            System.out.print("Digite um valor maior que zero: ");
        }
    }
}