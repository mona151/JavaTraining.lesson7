package transport;

public class Bus extends Transport {



    public Bus(float fuelConsumption, String model, int price, String manufacturer){
        super(model, manufacturer, fuelConsumption);
        setPrice(price);
    }

    public void getFullName(){
        System.out.println(getManufacturer() + " " + getModel() + ", price: " + getPrice() + ", fuel consumption: " + getFuelConsumption());
    }
}