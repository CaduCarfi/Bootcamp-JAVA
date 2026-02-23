public class Main {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
        runMusic(musicPlayer);
        runVideo(musicPlayer);
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}