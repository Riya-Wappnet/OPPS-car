


public class PetrolCar implements CarFactory {
    private int manu;
    
    public PetrolCar(int manu){
        this.manu=manu;
    }
    public AbstractCar createCar(){
       

        CarBody carBody= CarBody.CarCreation();
       
        Engine petrolEngine=new PetrolEngine(manu);
        petrolEngine.assemble();
        Wheel wheel=Wheel.wheelCreate();
        return new Car(petrolEngine, carBody,wheel);
    }
    
}
