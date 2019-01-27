package invoice.model;

import java.util.Objects;

public class Client implements Comparable<Client>{
    private int id;
    private ClientType clientType;
    private String shortName;
    private String name;
    private int discount;
    private Adress adress;



    public Client(int id, ClientType clientType, String shortName, String name, Adress adress) {
        this.id = id;
        this.clientType = clientType;
        this.shortName = shortName;
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public Adress getAdress() {
        return adress;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }



    @Override
    public String toString() {
        return "Client{" +
                id +'\'' +
                clientType +'\'' +
                shortName + '\'' +
                name + '\'' +
                discount +
                adress + '\'' +
                '}';
    }

    @Override
    public int compareTo(Client o) {
        return this.shortName.compareToIgnoreCase(o.shortName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(shortName, client.shortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName);
    }
}
