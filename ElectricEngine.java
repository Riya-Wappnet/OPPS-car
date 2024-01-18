import java.util.Scanner;

public class ElectricEngine implements Engine{
    private int power;
    private double capacity;  // in kilowatt-hours
    private String type;
    final String carType="Electric";
    public ElectricEngine(){}
   public ElectricEngine(int power,double capacity,String type,String carType){
    this.type=type;
    this.capacity=capacity;
    this.power=power;
   }

   @Override
public String toString() {
    return "Engine{" +'\n'+
            
            "   Car Type='" + carType + '\'' +'\n'+
            "   Battery Type='" + type + '\'' +'\n'+
            "       Power='" + power + '\'' +'\n'+
            "Capacity='" + capacity + '\'' +'\n'+
            '}'+'\n';
}
@Override
public Engine assemble() {
Scanner scanner = new Scanner(System.in);
    System.out.println("Power of battery");
    power=scanner.nextInt();
    System.out.println("capacity of battery");
    capacity=scanner.nextDouble();
    System.out.println("Battery type");
    type=scanner.next();
    return new ElectricEngine(power, capacity, type,carType);

}

}
