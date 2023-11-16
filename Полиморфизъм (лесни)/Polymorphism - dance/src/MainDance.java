public class MainDance {
    public static void main(String[] args) {
        DanceMove danceMove = new DanceMove("moonwalk", 5);
        BreakDanceMove breakDanceMove = new BreakDanceMove("windmill", 5, 8);
        Song song = new Song("'Bohemian Rhapsody'");
        danceMove.perform();
        System.out.printf("Performing the %s with complexity level %d\n",breakDanceMove.name ,breakDanceMove.complexity);
        danceMove.dance();
        danceMove.start();
        song.sing();
        DanceMove dance = new DanceMove("windmill", 5);
        BreakDanceMove breakDance = new BreakDanceMove("windmill", 5, 8);
        if(dance instanceof DanceMove)
        {
            System.out.println("This is a DanceMove");
        }
        if(breakDance instanceof BreakDanceMove)
        {
            System.out.println("This is a BreakDanceMove");
        }

    }
}
