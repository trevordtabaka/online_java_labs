package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class HockeyTeam{

        public static void main(String[] Args){

            Goalie trevor = new Goalie("Trevor", "Butterfly", 90, 65, 175);
            Defenseman dman1 = new Defenseman("Matthias", "2-way", 83, 80, 185);
            Forward forward1 = new Forward("Teis", "Power Forward", 75, 95, 183);

            dman1.speed = 86;
            trevor.weightKg = 68;
            forward1.style = "Sniper";
            forward1.speed = dman1.speed;




        }


}

class Goalie{
    String name;
    String style;
    int speed;
    double heightCm;
    int weightKg;

    Goalie(String name, String style, int speed, int weightKg, double heightCm){
        this.name = name;
        this.style = style;
        this.speed = speed;
        this. weightKg = weightKg;
        this.heightCm = heightCm;
    }


}
class Defenseman{
    String name;
    String style;
    int speed;
    double heightCm;
    int weightKg;

    Defenseman(String name, String style, int speed, int weightKg, double heightCm){
        this.name = name;
        this.style = style;
        this.speed = speed;
        this. weightKg = weightKg;
        this.heightCm = heightCm;
    }

}
class Forward{
    String name;
    String style;
    int speed;
    double heightCm;
    int weightKg;


    Forward(String name, String style, int speed, int weightKg, double heightCm){
        this.name = name;
        this.style = style;
        this.speed = speed;
        this. weightKg = weightKg;
        this.heightCm = heightCm;
    }
}