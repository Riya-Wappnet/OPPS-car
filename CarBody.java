import java.util.Scanner;

public class CarBody  {
    private String company;   
    private String material;
    private String color;
    private String modelLevel;
    private int airBag; 
    private String model;
    
    
    
    public CarBody(String company,String material,String color, String modelLevel,int airBag,String model){
        this.airBag=airBag;
        this.color=color;
        this.company=company;
        this.material=material;
        this.modelLevel=modelLevel;
        this.model=model;
       
    }
    @Override
    public String toString() {
        return "CarBody{"+'\n' +
                "   Companay='" + company + '\''+'\n' +
                "   Model='" + model + '\''+'\n' +
                "   Material='" + material + '\''+','+'\n' +
                "   Color='" + color + '\''+','+'\n' +
                "   ModelLevel='" + modelLevel + '\''+','+'\n' +
                "   Air Bag='" + airBag +'\''+ ','+'\n' +
                '}'+'\n';
    }

    // public static String CarCreation(int tyre){
    //     // if(tyre==1)
    //     return "MRF";
    // }

    public static CarBody CarCreation(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the detail for Car");
        System.out.println("Comapanay name: ");
        String companay=scanner.next();
        System.out.println("Model name: ");
        String model=scanner.next();
        System.out.println("Color of the Car: ");
        String color=scanner.next();
        System.out.println("Material of the Car: ");
        String material=scanner.next();
        System.out.println("AirBag in the Car: ");
        int airbag=scanner.nextInt();
        System.out.println("Which level of the Car: ");
        String modelLevel=scanner.next();
        
     
      

    
        return new CarBody(companay, material, color, modelLevel, airbag,model);
    }
}
