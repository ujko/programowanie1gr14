package invoice.DAO;

import invoice.model.Client;

import java.util.List;

public interface IClient {

    boolean addClient(Client client);

    boolean removeClient(int clientID);

    boolean editClient(int clientID, Client client);

    List<Client> getAllClients();

    List<Client> getClientsSortedBy(ClientSort clientSort);

    Client getClientByID(int clientID);

    List<Client> getClientByShortName(String shortName);

    List<Client> getClientByName(String name);

    Client getClientByNIP(String nip);
}
