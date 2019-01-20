package invoice.DAO;

import invoice.model.CompanyName;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CompanyNameDAO {
    CompanyName companyName = new CompanyName();

    public CompanyName getCompanyName() {
        return companyName;
    }

    public CompanyNameDAO() {
        fillCompanyName();
    }

    private void fillCompanyName() {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("invoice.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Brak pliku");
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        companyName.setCompanyName(properties.getProperty("company.name"));
        companyName.setAdress(properties.getProperty("company.adress"));
        companyName.setNip(properties.getProperty("company.nip"));
    }



}
