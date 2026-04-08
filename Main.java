import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    Cliente user1 = new Cliente();

    String nome;
        do{
            System.out.println("Digite seu Nome!");
            nome = entrada.nextLine();
            user1. // esperando get e set do nome ser criado
            if(nome.trim().isEmpty()) {
                System.out.println("Preencha com seu nome.");
            }
        }while (nome.trim().isEmpty());
    String email;
        do{
            System.out.println("Digite seu e-mail!");
            email = entrada.nextLine();
            user1. // esperando get e set do email
            if(email.trim().isEmpty()) {
                System.out.println("Preencha com seu e-mail!");
            }
        }while (email.trim().isEmpty());

    }
}
