/*
 * Main class
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 3
 * */
import java.util.*;

class Transport{
    protected float speed;
    protected float price;
}

class Auto extends Transport{
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

class Bus extends Transport{
    private String model;
    private String manufacturer;
    private int amountOfSeats;

    Bus(float speed, float price, String manufacturer ,String model , int amountOfSeats){
        this.speed = speed;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.amountOfSeats = amountOfSeats;
        System.out.println("Speed: " + speed + ", model: " + model + ", Seats: " + amountOfSeats);
    }
}

public class Main {
    public static void main(String[] args) {
        Auto cabSolaris = new Auto(210f, 670000,"Hyundai", "Solaris");
        Bus busMercedes=  new Bus(180f, 4800000,"Mecedes", "Travego 15 RH", 49);
    }
}
