package model;

public class Product implements Comparable {

    public enum Type {
        chips(30), soda(25), chocolate(20);

        private int gain;

        Type(int gain) {
            this.gain = gain;
        }

        public int gain() {
            return gain;
        }
    }

    private String name;
    private Double price;
    private Type type;
    Double income;

    public Product(String name, Double price, Type type) {
        this.name = name;
        this.price = price;
        this.type = type;
        income = ((price * type.gain())/100);
    }

    public String toString() {
        return String.format("NAME: %1s, PRICE: %2.2f, TYPE: %3s, INCOME: %5.2f \n", name, price, type.name(), income);
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(income, ((Product) o).income);
    }

}
