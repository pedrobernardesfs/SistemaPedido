import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    Cliente user1 = new Cliente();
    Pedido Pedido1 = new Pedido();

    String nome;
        do{
            System.out.println("Digite seu Nome!");
            nome = entrada.nextLine();
            user1.setNome(nome);
            if(nome.trim().isEmpty()) {
                System.out.println("Preencha o seu nome.");
            }
        }while (nome.trim().isEmpty());
    String email;
        do{
            System.out.println("Digite seu e-mail!");
            email = entrada.nextLine();
            user1.setEmail(email);
            if(email.trim().isEmpty()) {
                System.out.println("Preencha com seu e-mail!");
            }
        }while (email.trim().isEmpty());


    }
}
