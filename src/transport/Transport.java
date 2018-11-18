package transport;

public abstract class Transport{

    private float fuelConsumption;
    private int price;

    public Transport(float fuelConsumption){
        this.fuelConsumption = fuelConsumption;
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

    public abstract void getFullName();
}
