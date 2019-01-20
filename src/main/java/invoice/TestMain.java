package invoice;

import invoice.DAO.ClientMem;
import invoice.DAO.ClientSort;
import invoice.DAO.CompanyNameDAO;
import invoice.DAO.IClient;
import invoice.model.Adress;
import invoice.model.Client;
import invoice.model.ClientType;
import invoice.model.CompanyName;

public class TestMain {

    public static void main(String[] args) {
//        testDAO();
        CompanyNameDAO companyNameDAO = new CompanyNameDAO();
        CompanyName companyName = companyNameDAO.getCompanyName();
        System.out.println(companyName);

    }

    private static void testDAO() {
        IClient iClient = new ClientMem();
        iClient.getAllClients().forEach(System.out::println);
        System.out.println("*****************");
        Adress adress1 = new Adress(8, "New City", "Street Like Hell", "123123123");
        Client client1 = new Client(8, ClientType.INDIVIDUAL, "SKLEP", "SKLEP Z O.O.", adress1);
        System.out.println("Wyciagnieto z bvazy klienta o ID 2: \n" + iClient.getClientByID(2));
        System.out.println("*****************");
        System.out.println("Klienta dodano true/false: \n" + iClient.addClient(client1));
        System.out.println("*****************");
        System.out.println("Klient o ID 2 zostal edytowany ture/false: \n" + iClient.editClient(2, client1));
        System.out.println("*****************");
        iClient.getAllClients().forEach(System.out::println);
        System.out.println("Usuwanie klienta");
        iClient.removeClient(client1.getId());
        iClient.getAllClients().forEach(System.out::println);
        System.out.println("*****************");
        System.out.println("sortowanie po ID");
        iClient.getClientsSortedBy(ClientSort.ID).forEach(System.out::println);
        System.out.println("Sortowanie po name");
        iClient.getClientsSortedBy(ClientSort.NAME).forEach(System.out::println);
        System.out.println("sortowanie po CITY");
        iClient.getClientsSortedBy(ClientSort.CITY).forEach(System.out::println);
        System.out.println("Wyszukiwanie po frazie name");
        iClient.getClientByName("ow").forEach(System.out::println);
        System.out.println("Wyszukiwanie po ID");
        System.out.println(iClient.getClientByID(2));
        System.out.println(iClient.getClientByID(50));
        System.out.println("Wyszukiwanie po ShortName");
        iClient.getClientByShortName("SDA").forEach(System.out::println);
        System.out.println("Wyszukiwanie po NIP");
        System.out.println(iClient.getClientByNIP("523-12-12-123"));
        System.out.println(iClient.getClientByNIP("2345356446"));
    }
}
