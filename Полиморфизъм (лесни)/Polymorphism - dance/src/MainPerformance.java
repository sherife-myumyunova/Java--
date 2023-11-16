public class MainPerformance {
    public static void main(String[] args) {
        DanceMove danceMove = new DanceMove("moonwalk", 5);
        BreakDanceMove breakDanceMove = new BreakDanceMove("windmill", 5, 8);
        Song song = new Song("'Bohemian Rhapsody'");
        DJ dj = new DJ();

        Performance[] performances = {danceMove, breakDanceMove, song};

        for (Performance performance : performances) {
            performance.start();
        }
        System.out.println();
        Party party = new Party(performances);

        party.startParty();
    }
}
