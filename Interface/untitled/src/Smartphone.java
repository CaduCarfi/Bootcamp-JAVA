public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("O SmartPhone esta reproduzindo o Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O SmartPhone esta pausando o Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O SmartPhone esta parando o Video");
    }

    @Override
    public void playMusic() {
        System.out.println("O SmartPhone esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O SmartPhone esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O SmartPhone esta parando a música");
    }
}
