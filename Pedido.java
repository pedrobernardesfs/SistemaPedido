import java.time.LocalDate;

public class Pedido {
    private int numero;
    private LocalDate data;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.numero = (int)(Math.random() * 90000) + 10000;
        this.data = LocalDate.now();
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}