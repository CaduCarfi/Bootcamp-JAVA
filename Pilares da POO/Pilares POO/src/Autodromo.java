public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897897");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("467754");
        //z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }
}
