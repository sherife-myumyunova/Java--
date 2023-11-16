public class Song extends Performance implements Playable{
    String title;

    public Song(String title) {
        this.title = title;
    }

    void sing()
    {
        System.out.println("Singing " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing " + title);
    }

    @Override
    void start()
    {
        System.out.println("Starting the " + title);
    }
}
