public class SimpleCar extends Vehicle implements Honkable{
    int speed;

    int accelerate()
    {
        speed += 10;
        return speed;
    }

    @Override
    public void honk() {
        System.out.println("Honk!");
    }
}
