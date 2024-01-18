import java.util.Random;

abstract class AbstractCar {
    protected String registrationNumber;
    protected Engine carEngine;
    protected Wheel wheels;
    // private List<Wheel> wheels;
    protected CarBody carbody;

    public AbstractCar(Engine carEngine, CarBody carBody,Wheel wheels) {
        this.carEngine = carEngine;
        this.carbody = carBody;
        this.wheels=wheels;
        registrationNumber = registrationNumber();
    }

    abstract void displayAdditionalInfo();

    public String registrationNumber() {
        StringBuilder continuousString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            if (random.nextBoolean()) {
                // Append a random alphabet
                continuousString.append((char) ('a' + random.nextInt(26)));
            } else {
                // Append a random number
                continuousString.append(random.nextInt(10));
            }
        }

        return continuousString.toString();
    }

    public String toString() {
        return "Car{" +                "\n" +

                "Registration Number='" + registrationNumber + '\'' +','+
                "\n" + "CarEngine=" +'\n'+ carEngine +
                // ", wheels=" + wheels +
                "carBody=" +'\n'+ carbody +
                "Wheels=" +'\n'+ wheels +
                '\n' +

                '}';
    }

}
