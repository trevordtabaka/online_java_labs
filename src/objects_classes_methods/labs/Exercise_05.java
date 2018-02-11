package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class ClassInstance{

    public static int count;

    public String name;

    public static void main(String[] args) {

        System.out.println("I can display count before making a class instance. count= " + count);

        ClassInstance inst1 = new ClassInstance("instance1");
        ClassInstance inst2 = new ClassInstance("instance2");

        System.out.println("inst1 has a name of " + inst1.name);
        inst2.name = "Trevor";
        System.out.println("inst2 has a name of " + inst2.name);



    }

    ClassInstance(String name){

        count++;
        this.name = name;
        System.out.println("Now, the count= " + count);


    }

}