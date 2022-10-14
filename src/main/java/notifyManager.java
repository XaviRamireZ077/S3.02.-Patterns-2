import java.util.ArrayList;

public class notifyManager {

    private ArrayList<Client> clients = new ArrayList<>();

    public void add(Client c) {
        clients.add(c);
    }


    public void notifyAllClients(Notify n) {
        for (Client client : clients) {
            client.update(n);
        }

    }

}
