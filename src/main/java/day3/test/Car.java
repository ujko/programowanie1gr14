package day3.test;

public enum Car {

    INSTANCE;
    private String s;


    public void writeSth() {
        System.out.println("Sth");
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
