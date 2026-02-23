public class Computer implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("O Computador esta reproduzindo o Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador esta pausando o Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador esta parando o Video");
    }

    @Override
    public void playMusic() {
        System.out.println("O Computador esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador esta parando a música");
    }
}
