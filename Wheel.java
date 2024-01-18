import java.util.Scanner;

class Wheel {
    private String brand;
    private int size;

    public Wheel(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public static Wheel wheelCreate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter wheel details:");
        System.out.println("Brand: ");
        String brand = scanner.next();
        System.out.println("Size: ");
        int size = scanner.nextInt();
        // Wheel wheel=new Wheel(brand, size);

        return new Wheel(brand,size);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "   brand='" + brand + '\'' +
                ","+"\n" +"    size=" + size +"\n"+
                '}';
    }
}
