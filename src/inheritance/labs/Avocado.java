package inheritance.labs;

public class Avocado extends Fruit{

    private boolean isPrepared;
    private boolean isOrganic;



    public Avocado(boolean isEdible, String foodType, String color) {
        super(isEdible, foodType, color);
    }

    public Avocado(boolean isEdible, boolean isRotten, boolean isClean, String foodType, String color) {
        super(isEdible, isRotten, isClean, foodType, color);
    }


    @Override
    public String howToEat() {



        return "Open the avocado up and scoop out the innards";
    }

    public boolean isPrepared() {
        return isPrepared;
    }

    public void setPrepared(boolean prepared) {
        isPrepared = prepared;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }
}
