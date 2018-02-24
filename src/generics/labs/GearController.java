package generics.labs;

import java.util.ArrayList;

public class GearController {

    public static void main(String[] args) {

        Gear<String, Helmet> myHelmet = new Gear<>("My Helmet", new Helmet("Bauer", "Small"));
        Gear<String, Skates> mySkates = new Gear<>("My Skates", new Skates("Bauer", 9.5));

        ArrayList<Gear> myGear = new ArrayList<>();

        myGear.add(myHelmet);
        myGear.add(mySkates);
        System.out.println("I have " + myGear.size() + " pieces of gear");
        System.out.println(mySkates.name);
        System.out.println(mySkates.gearObject);
        System.out.println(myHelmet.name);
        System.out.println(myHelmet.gearObject);




    }

}
