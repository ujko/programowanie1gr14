package invoice.model;

public class CompanyName {
    private String companyName;
    private String adress;
    private String nip;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "CompanyName{" +
                "companyName='" + companyName + '\'' +
                ", adress='" + adress + '\'' +
                ", nip='" + nip + '\'' +
                '}';
    }
}
