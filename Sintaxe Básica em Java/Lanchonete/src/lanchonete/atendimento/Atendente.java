package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("Servindo Mesa");
    }
    private void pegarLancheCozinha() {
        System.out.println("Pegando Lanche Cozinha");
    }
    public void receberPagamento() {
        System.out.println("Receberando Pagamento");
    }
    void trocarGas() {
        System.out.println("Atendente Trocando a GAS");
    }
    private void pegarPedidoBalcao() {
        System.out.println("Pegando Pedido no Balcao");
    }
}
