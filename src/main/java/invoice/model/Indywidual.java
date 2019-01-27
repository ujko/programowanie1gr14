package invoice.model;

public class Indywidual extends Client{
    String pesel;

    public Indywidual(int id, ClientType clientType, String shortName, String name, Adress adress) {
        super(id, clientType, shortName, name, adress);

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Indywidual{" +
                super.toString()+
                "pesel='" + pesel + '\'' +
                '}';
    }




}
