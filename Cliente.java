import java.util.Scanner;

public class Cliente {

    private String nome;
    private String email;

    public Cliente() {

          Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();
        } while (nome.isEmpty());

        do {
            System.out.print("Digite o email: ");
            email = sc.nextLine();
        } while (email.isEmpty());
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}