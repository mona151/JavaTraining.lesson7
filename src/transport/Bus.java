package transport;

public class Bus extends Transport {

    private String model;
    private String manufacturer;

    public Bus(float fuelConsumption, String model, float price, String manufacturer){

        super(fuelConsumption);

        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void getFullName(){
        System.out.println(manufacturer + " " + model + ", fuel consumption: " + getFuelConsumption());
    }
}