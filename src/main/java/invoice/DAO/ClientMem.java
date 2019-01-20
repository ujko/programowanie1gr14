package invoice.DAO;

import invoice.model.Adress;
import invoice.model.Client;
import invoice.model.ClientType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientMem implements IClient {

    private List<Client> listOfClients = new ArrayList<>();

    public ClientMem() {
        listOfClientCreation();
    }

    private void listOfClientCreation() {
        Adress adress1 = new Adress(1, "Lodz", "Ulica Nazwa1", "90-123");
        Client client1 = new Client(1, ClientType.BUSINESS, "SDA1", "Software Dev Academy1", adress1);
        client1.setNip("123-12-12-123");
        Adress adress2 = new Adress(2, "Warszawa", "Ulica Nazwa2", "80-123");
        Client client2 = new Client(2, ClientType.BUSINESS, "SDA2", "Software Dev Academy2", adress2);
        client2.setNip("223-12-12-123");
        Adress adress3 = new Adress(3, "Gdansk", "Ulica Nazwa3", "70-123");
        Client client3 = new Client(3, ClientType.INDIVIDUAL, "Ala", "Ala Nowak", adress3);
        client3.setNip("323123123");
        Adress adress4 = new Adress(4, "Radom", "Ulica Nazwa4", "60-123");
        Client client4 = new Client(4, ClientType.INDIVIDUAL, "Ela", "Ela Kowalska", adress4);
        client4.setNip("4231212123");
        Adress adress5 = new Adress(5, "Sosnowiec", "Ulica Nazwa5", "50-123");
        Client client5 = new Client(5, ClientType.FARMER, "ogrodnicy", "Szkolka Ogrodnicza", adress5);
        client5.setNip("523-12-12-123");

        listOfClients.add(client1);
        listOfClients.add(client2);
        listOfClients.add(client3);
        listOfClients.add(client4);
        listOfClients.add(client5);
    }

    @Override
    public boolean addClient(Client client) {
        return listOfClients.add(client);
    }

    @Override
    public boolean removeClient(int clientID) {
        return listOfClients.remove(getClientByID(clientID));
    }

    @Override
    public boolean editClient(int clientID, Client client) {
        Client clientTemp = getClientByID(clientID);
        clientTemp.setName(client.getName());
        clientTemp.setAdress(client.getAdress());
        clientTemp.setClientType(client.getClientType());
        clientTemp.setNip(client.getNip());
        clientTemp.setDiscount(client.getDiscount());
        clientTemp.setPesel(client.getPesel());
        clientTemp.setShortName(client.getShortName());
        removeClient(clientID);
        return listOfClients.add(clientTemp);
    }

    @Override
    public List<Client> getAllClients() {
        Collections.sort(listOfClients);
        return listOfClients;
    }

    @Override
    public List<Client> getClientsSortedBy(ClientSort clientSort) {

        switch (clientSort) {
            case ID:
                return listOfClients.stream()
                        .sorted(Comparator.comparingInt(Client::getId))
                        .collect(Collectors.toList());
            case NAME:
                return listOfClients.stream()
                        .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                        .collect(Collectors.toList());
            case CITY:
                return listOfClients.stream()
                        .sorted((x, y) -> x.getAdress().getCity().compareToIgnoreCase(y.getAdress().getCity()))
                        .collect(Collectors.toList());
            case CLIENTTYPE:
                return listOfClients.stream()
                        .sorted(Comparator.comparing(Client::getClientType))
                        .collect(Collectors.toList());
        }
        return listOfClients;
    }

    @Override
    public Client getClientByID(int clientID) {
        Client emptyClient = new Client(-1, null, null, null, null);
        return listOfClients.stream()
                .filter(x -> x.getId() == clientID)
                .findFirst().orElse(emptyClient);
    }

    @Override
    public List<Client> getClientByShortName(String shortName) {
        return listOfClients.stream()
                .filter(x -> x.getShortName().contains(shortName))
                .collect(Collectors.toList());
    }

    @Override
    public List<Client> getClientByName(String name) {
        return listOfClients.stream()
                .filter(x -> x.getName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public Client getClientByNIP(String nip) {
        return listOfClients.stream()
                .filter(x -> nip.equals(x.getNip()))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("NIP nie istnieje"));
    }
}
