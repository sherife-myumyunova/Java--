public class MainCars {
    public static void main(String[] args) {
        SimpleCar simpleCar = new SimpleCar();
        FamilyCar familyCar = new FamilyCar();
        Bicycle bicycle = new Bicycle();
        System.out.println("Speed after accelerate: " + simpleCar.accelerate());
        System.out.println("Seats after adding one: " + familyCar.addSeats());
        simpleCar.honk();
        simpleCar.move();
        bicycle.pedal();
        SimpleCar car1 = new SimpleCar();
        FamilyCar car2 = new FamilyCar();

        if(car1 instanceof SimpleCar)
        {
            System.out.println("This is a SimpleCar");
        }
        if(car2 instanceof FamilyCar)
        {
            System.out.println("This is a FamilyCar");
        }
    }
}
