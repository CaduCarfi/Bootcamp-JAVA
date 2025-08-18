package atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcao");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche() {
        System.out.println("Preparando lanche");
    }
    public void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }
    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche() {
        System.out.println("Selecionado o pão, salada, ovo e carne");
    }
    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionado fruta, leite e suco");
    }
    public void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    public void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");
    }
    public void fritarIngredientesLanche() {
        System.out.println("Fritando ingredientes do lanche");
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
