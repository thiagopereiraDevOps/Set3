public class Produto implements Comparable<Produto> {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Produto other) {
        return name.toUpperCase() .compareTo(other.getName() .toUpperCase());
    }
}
