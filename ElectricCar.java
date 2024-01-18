import java.util.Random;

/**
 * ElectricCar
 */
public class ElectricCar implements CarFactory{
    // Car car;
    // String registrationNumber=car.registrationNumber();
    public AbstractCar createCar(){
        CarBody carBody=CarBody.CarCreation();
        Engine electricEngine=new ElectricEngine();
        electricEngine.assemble();
        Wheel wheel=Wheel.wheelCreate();
        return new Car(electricEngine,carBody,wheel
        // ,registrationNumber
        );
    }

   
}