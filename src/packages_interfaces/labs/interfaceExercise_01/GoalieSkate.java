package packages_interfaces.labs.interfaceExercise_01;

public class GoalieSkate extends HockeySkate {

    @Override
    public void bladeType() {
        System.out.println("The goalie skate uses a flat blade");
    }

    @Override
    public void bootType() {
        System.out.println("Boot Characteristics:");
        System.out.println("* The goalie skate is extra reinforced");
        System.out.println("* The ankle Height is low");
        System.out.println("* The ankle is supported");
    }

    @Override
    public void securingMechanism() {
        super.securingMechanism();
        System.out.println("The securing mechanism is the same as the Hockey Skate");
    }
}
