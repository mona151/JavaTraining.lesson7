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


public class Main {
    public static void main(String[] args) {
        Bus busMercedes = new Bus(180f, "Travego 15 RH", 4800000, "Mercedes");
        Auto cabSolaris = new Auto(12f, "Solaris", 630000, "Huyndai");

        List<Transport> transport = new ArrayList<Transport>();
        transport.add(busMercedes);
        transport.add(cabSolaris);
        park.Park park = new Park(transport);
        park.getParkInfo();
    }
}
