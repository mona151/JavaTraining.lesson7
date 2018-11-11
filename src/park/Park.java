package park;

import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Transport> transport = new ArrayList<Transport>();

    public Park(List<Transport> transport){
        this.transport = transport;
    }

    public void getParkInfo(){
        System.out.println("Amount of cars in the park is " + transport.size());
        for (int i = 0; i < transport.size(); i++) {
            transport.get(i).getFullName();
        }
    }
}
