package transport;

import annotations.FieldValueIsNotZero;
import annotations.RestrictedNumericValue;

public abstract class Transport {
    private String model;
    private String manufacturer;

    @RestrictedNumericValue
    private float fuelConsumption;

    @FieldValueIsNotZero
    private int price;

    public Transport(String model, String manufacturer, float fuelConsumption) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract void getFullName();
}