package invoice.model;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private Client client;
    private LocalDate creationDate;
    private List<Product> productList;
    private double sumPrice;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
        productList.forEach(x->sumPrice += x.getPrice());
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", client=" + client +
                ", creationDate=" + creationDate +
                ", productList=" + productList +
                ", sumPrice=" + sumPrice +
                '}';
    }
}
