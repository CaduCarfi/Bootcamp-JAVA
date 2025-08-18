import atendimento.cozinha.Almoxarife;

public class Estabelecimento {
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();
}
