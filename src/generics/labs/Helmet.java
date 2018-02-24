package generics.labs;

public class Helmet {
    private String Brand;
    private String Size;

    public Helmet(String brand, String size) {
        Brand = brand;
        Size = size;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "Brand='" + Brand + '\'' +
                ", Size='" + Size + '\'' +
                '}';
    }
}
