/*
 * Main class
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 3
 * */
import park.Park;
import transport.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Bus busMercedes = new Bus(180f, "Travego 15 RH", 4800000, Manufacturers.MERCEDES.toString());
        Bus busToyota = new Bus(150f, "Coaster", 800000, Manufacturers.TOYOTA.toString());
        Bus busMan = new Bus(178.7f, "MAGNIT", 1800000, Manufacturers.MAN.toString());
        Bus busIsuzu = new Bus(80f, "Novoultra 4HK1E", 4800000, Manufacturers.ISUZU.toString());
        Auto cabSolaris = new Auto(12f, "Solaris", 630000, Manufacturers.HUYNDAI.toString());
        int fuelConsumptionMin, fuelConsumptionMax, priceMin, priceMax;
        Scanner in = new Scanner(System.in);
        List<Transport> transport = new ArrayList<Transport>();
        transport.add(busMercedes);
        transport.add(cabSolaris);
        transport.add(busIsuzu);
        transport.add(busMan);
        transport.add(busToyota);
        park.Park park = new Park(transport);

        park.getParkInfo();
        System.out.println("Park total price is " + park.getParkTotalPrice());
        park.sortParkByFuelConsumption();
        System.out.println("Enter desired min and max fuel consumption + min and max price:");
        fuelConsumptionMin = in.nextInt();
        fuelConsumptionMax = in.nextInt();
        priceMin = in.nextInt();
        priceMax = in.nextInt();
        park.getTransportByParameters(fuelConsumptionMin, fuelConsumptionMax, priceMin, priceMax);
    }
}
