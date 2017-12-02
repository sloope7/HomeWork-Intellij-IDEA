package Exercise7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Transmission(5),new FuelTank(20,60),200);
        car.startTheCar();
        car.go();
        car.stop();
        car.muffleTheCar();
        car.changeGear(3);
        car.refuel(20);
        System.out.println(car.fuelTank.amountOfFuelAtTheMoment);
        System.out.println(car.currentSpeed());



    }
}
