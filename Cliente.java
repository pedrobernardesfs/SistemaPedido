public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {

        if (nome.isEmpty()) {
            System.out.println("Nome inválido");
        }

        if (email.isEmpty()) {
            System.out.println("Email inválido");
        }

        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}