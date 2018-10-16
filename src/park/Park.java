package park;

import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Transport> transport = new ArrayList<Transport>();
    public Park(List<Transport> transport){
        this.transport = transport;
    }

}
