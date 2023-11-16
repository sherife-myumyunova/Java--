public class DJ implements Playable{

    public void playSong(Song song) {
        song.play();
    }

    @Override
    public void play() {
        System.out.println("Playing 'Bohemian Rhapsody'");
    }
}
