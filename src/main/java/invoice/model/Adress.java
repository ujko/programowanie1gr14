package invoice.model;

public class Adress {

    private int id;
    private String city;
    private String streetName;
    private String zipCode;

    public Adress(int id, String city, String streetName, String zipCode) {
        this.id = id;
        this.city = city;
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
