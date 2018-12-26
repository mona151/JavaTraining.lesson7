package transport;

import annotations.CheckClassModifier;

@CheckClassModifier
public final class Auto extends Transport {


    public Auto(float fuelConsumption, String model, int price, String manufacturer){
        super(model, manufacturer, fuelConsumption);
        setPrice(price);
    }

    public void getFullName(){
        System.out.println(getManufacturer() + " " + getModel() + ", price: " + getPrice() + ", fuel consumption: " + getFuelConsumption());
    }
}