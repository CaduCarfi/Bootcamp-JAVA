public class MusicBox implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O caixa de musica esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O caixa de musica esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O caixa de musica esta parando a música");
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void pauseVideo() {

    }

    @Override
    public void stopVideo() {

    }
}
