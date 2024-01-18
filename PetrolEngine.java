import java.util.Scanner;

/**
 * PetrolEngine
 */
public class PetrolEngine implements Engine {

   private int horsePower;
   private String carType;
    public PetrolEngine(int manu){
        if (manu==1) {
            carType="Petrol";
        }else{
            carType="Diseal";
        }
    }
   public PetrolEngine(int horsePower,String carType) {
    this.horsePower=horsePower;

}

@Override
public String toString() {
    return "CarEngine{" +'\n'+
            "       HoursePower='" + horsePower + '\'' +'\n'+
            "       Car Type='" + carType + '\'' +'\n'+
            
            '}'+'\n';
}



@Override
public Engine assemble() {
    Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter horse power of engine: ");
        horsePower=scanner.nextInt();
        
        return new PetrolEngine(horsePower,carType);
    
    
} 

   
}