package transport;

public class Bus extends Transport {
    private String model;
    private String manufacturer;
    private int amountOfSeats;

    Bus(float speed, float price, String manufacturer, String model, int amountOfSeats) {
        this.speed = speed;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.amountOfSeats = amountOfSeats;
        System.out.println("Speed: " + speed + ", model: " + model + ", Seats: " + amountOfSeats);
    }
}