package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o Lanche");
    }
    public void fazerPedido() {
        System.out.println("Fazendo o Pedido");
    }
    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando a Conta");
    }
    private void consultarSaldoAplicativo() {
        System.out.println("Consultando Saldo no Aplicativo");
    }
}
