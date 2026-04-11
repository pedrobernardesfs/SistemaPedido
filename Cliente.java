public class Cliente {
    
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void dadosCliente( String nome, String email) {
        System.out.println("Nome do cliente: " + nome );
        System.out.println("Email do cliente: " + email);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}