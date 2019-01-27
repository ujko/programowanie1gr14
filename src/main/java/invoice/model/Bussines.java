package invoice.model;

public class Bussines extends Client{
    String nip;

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Bussines(int id, ClientType clientType, String shortName, String name, Adress adress) {
        super(id, clientType, shortName, name, adress);

    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "Bussines{" +
                super.toString()+
                "nip='" + nip + '\'' +
                '}';
    }
}
