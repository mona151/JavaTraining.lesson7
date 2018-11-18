package transport;

public class Bus extends Transport {

    private String model;
    private String manufacturer;

    public Bus(float fuelConsumption, String model, int price, String manufacturer){

        super(fuelConsumption);
        setPrice(price);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void getFullName(){
        System.out.println(manufacturer + " " + model + ", price: " + getPrice() + ", fuel consumption: " + getFuelConsumption());
    }
}