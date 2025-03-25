package Aprendendo.a.Sintaxe.Java.Exercicios.sistemaSmartTV;

public class usuario {

    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual : " +smartTV.volume);

        System.out.println("Canal Atual : " +smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal Atual : " +smartTV.canal);

        System.out.println("TV Ligada ? " +smartTV.ligado);
        System.out.println("Canal Atual : " +smartTV.canal);
        System.out.println("Volume Atual : " +smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada ? " +smartTV.ligado);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada ? " +smartTV.ligado);
    }
}
