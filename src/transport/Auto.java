package transport;

public class Auto extends Transport {
    private String model;
    private String manufacturer;

    Auto (float speed, float price, String manufacturer , String model){

        this.speed = speed;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        System.out.println("Speed: " + speed + ", model: " + model);
    }
}
