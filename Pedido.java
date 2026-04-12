import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int         numeroPedido;
    private LocalDate   data;
    private Cliente     cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    public Pedido(int numeroPedido, LocalDate data, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.data         = data;
        this.cliente      = cliente;
    }
    public int              getNumeroPedido() { return numeroPedido; }
    public LocalDate        getData()         { return data; }
    public Cliente          getCliente()      { return cliente; }
    public List<ItemPedido> getItens()        { return itens; }
    public void setData(LocalDate data)      { this.data   = data; }
    public void setCliente(Cliente cliente)  { this.cliente = cliente; }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("========================================");
        System.out.printf("Pedido #%d%n", numeroPedido);
        System.out.printf("Data   : %s%n", data);
        System.out.printf("Cliente: %s (%s)%n", cliente.getNome(), cliente.getEmail());
        System.out.println("----------------------------------------");
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL  : R$ %.2f%n", calcularTotal());
        System.out.println("========================================");
    }
}