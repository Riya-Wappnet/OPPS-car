import java.util.Random;

class Car extends AbstractCar{
    public Car(Engine carEngine,CarBody carBody,Wheel wheels){
        
        super(carEngine,carBody,wheels);
    }
    
    @Override
    public void displayAdditionalInfo() {
        System.out.println("Displaying additional info for Car...");
        // Additional info specific to Car class
    }

    
}
