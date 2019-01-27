package invoice.model;

public enum Tax {

    VAT_A(1.23), VAT_B(1.08), VAT_C(1.05);
    private double value;

    Tax(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
