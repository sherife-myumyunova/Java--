public class DanceMove extends Performance implements Danceable{
    String name;
    int duration;

    public DanceMove(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    void perform()
    {
        System.out.printf("Performing the %s for %d seconds\n", name, duration);
    }

    @Override
    public void dance() {
        System.out.println("Dancing the salsa");
    }

    @Override
    void start() {
        System.out.println("Starting the " + name);
    }
}
