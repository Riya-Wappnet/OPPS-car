import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a type of car to manufacture: ");
        System.out.println("1) Petrol Car");
        System.out.println("2) Diseal Car");
        System.out.println("3) Electric Car");
        CarFactory carFactory = null;
        int manu = scanner.nextInt();
        switch (manu) {
            case 1:
                System.out.println("Petrol Car ");
                carFactory = new PetrolCar(manu);

                break;
            case 2:
                System.out.println("Diseal Car");
                carFactory = new PetrolCar(manu);
                break;
            case 3:
                System.out.println("Electric Car");
                carFactory = new ElectricCar();
                break;
            default:
                System.out.println("Please Enter Valid Detail");
                System.exit(0);
                break;

        }
        AbstractCar manufacturedCar = carFactory.createCar();
        
        manufacturedCar.displayAdditionalInfo();
        System.out.println(manufacturedCar);
    }

}
