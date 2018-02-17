package packages_interfaces.labs.interfaceExercise_01;

public class HockeySkate implements IceSkate{


    @Override
    public void bladeType() {
        System.out.println("The hockey skate has a standard, rounded ice hockey blade");

    }

    @Override
    public void bootType() {
        System.out.println("Boot Characteristics:");
        System.out.println("* The hockey skate is reinforced");
        System.out.println("* The ankle Height is high");
        System.out.println("* The ankle is supported");

    }

    @Override
    public void securingMechanism() {
        System.out.println("Hockey skates use laces to secure the skate to the foot");
    }
}
