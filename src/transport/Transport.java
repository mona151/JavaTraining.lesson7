package transport;

public abstract class Transport {
    private String model;
    private String manufacturer;
    private float fuelConsumption;
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