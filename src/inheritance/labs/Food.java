package inheritance.labs;

public class Food {

    private boolean isEdible = true;
    private boolean isRotten = false;
    private boolean isClean = true;
    private String foodType;


    public Food(boolean isEdible, String foodType) {
        this.isEdible = isEdible;
        this.foodType = foodType;
    }

    public Food(boolean isEdible, boolean isRotten, boolean isClean, String foodType) {
        this.isEdible = isEdible;
        this.isRotten = isRotten;
        this.isClean = isClean;
        this.foodType = foodType;
    }


    public String howToEat(){

        return "Unknown";
    }




    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public boolean isRotten() {
        return isRotten;
    }

    public void setRotten(boolean rotten) {
        isRotten = rotten;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
