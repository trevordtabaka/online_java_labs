package inheritance.labs;

public class Fruit extends Food {

   private String shape;
   private String color;

   // Constructors
    public Fruit(boolean isEdible, String foodType, String color) {
        super(isEdible, foodType);
        this.color = color;
    }

    public Fruit(boolean isEdible, boolean isRotten, boolean isClean, String foodType, String color) {
        super(isEdible, isRotten, isClean, foodType);
        this.color = color;

    }

    //// Getter Setters

    public String getFruitFamily() {
        return shape;
    }

    public void setFruitFamily(String fruitFamily) {
        this.shape = fruitFamily;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /// Random method that I can use to call through an avocado class
    public void fruitMethod(){

        System.out.println("fruitMethod was called");
    }

}
