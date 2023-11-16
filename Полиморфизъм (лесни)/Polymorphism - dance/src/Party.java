public class Party {
    Performance[] performances;

    public Party(Performance[] performances) {
        this.performances = performances;
    }

    void startParty()
    {
        for (Performance performance : performances) {
            performance.start();
        }
        System.out.println("Party started!");
    }
}
