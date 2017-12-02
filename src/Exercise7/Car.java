package Exercise7;

public class Car {
    Engine engine;
    BodyCar bodyCar;
    Transmission transmission;
    FuelTank fuelTank;
    int maxSpeed;
    boolean isCarStarted;
    boolean isRun;
    int currentGear = 0;
    String brand;
    String color;
    String carNumber;

    public Car(Transmission transmission, FuelTank fuelTank, int maxSpeed) {
        this.transmission = transmission;
        this.fuelTank = fuelTank;
        this.maxSpeed = maxSpeed;
    }

    public void startTheCar(){
        if(!isCarStarted && currentGear == 0 && fuelTank.amountOfFuelAtTheMoment > 0){
            isCarStarted = true;
            System.out.println("Mashina zavelas");
        }
    }

    public void go(){
        if(isCarStarted == true){
            currentGear++;
            isRun = true;
            System.out.println("Mashina poehala");
        }
    }

    public void stop(){
        if(isRun == true){
            isRun = false;
            currentGear = 0;
            System.out.println("Mashina ostanovilas");
        }
    }

    public void muffleTheCar(){
        if(isRun == true){
            stop();
            isCarStarted = false;
            System.out.println("Mashina zaglushena");

        }else{
            isCarStarted = false;
            System.out.println("Mashina zaglushena");
        }
    }

    public void changeGear(int switchGear){
        if (isRun == false) {
            currentGear++;
            System.out.println("Vklyuchena peredacha " + currentGear);

        }else{
            if (Math.abs(switchGear - currentGear) <= 3){
                currentGear = switchGear;
                System.out.println("Vklyuchena peredacha " + currentGear);
            }
        }
    }

    public void refuel(int countOfLiters){
        if(fuelTank.amountOfFuelAtTheMoment + countOfLiters <= fuelTank.maximumVolumeOfFuelTank){
           fuelTank.amountOfFuelAtTheMoment += countOfLiters;
        }
    }

    public int currentSpeed(){
        return (maxSpeed / transmission.numberOfGears) * currentGear;
    }




}
/*
1. Завести(если она заглушена и передача нетральная)
2. Поехать(если она заведена и включена первая передача)
3. Остоновить(если она едет)
4. Заглушить(есом она заведена)
5. Переключить передачу(Если машина стоит то только на первую, если едет то не больше чем через две)
6. От включенной передачи(должна зависеть текущая скорость автомобиля, макс скорость делим на количество передач) (макс скорость 200, кол передач 6, значит если включена 2 передача машина едет со скоростью 60)
7. Заправить бак(не больше чем его объем - количество топливо в нем)
8. Машина не должна ехать если бак пустой.
 */