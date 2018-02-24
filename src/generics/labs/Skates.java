package generics.labs;

public class Skates {
    private String brand;
    private Double size;

    public Skates(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Skates{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
