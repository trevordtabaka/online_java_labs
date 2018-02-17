package packages_interfaces.labs.interfaceExercise_01;

public class FigureSkate implements IceSkate {


    @Override
    public void bladeType() {
        System.out.println("The figure skate has a toe pick blade");
    }

    @Override
    public void bootType() {
        System.out.println("The figure skate has a unsuportted boot");

    }

    @Override
    public void securingMechanism() {

        System.out.println("The figure skate can have laces or straps to secure it on the foot");

    }
}
