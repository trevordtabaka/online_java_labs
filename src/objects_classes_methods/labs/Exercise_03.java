package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */


class Class1{



    public static void main(String[] args) {

        Class1 class1 = new Class1();

        Person person1 = new Person("Dave", 17, 4);
        Person person2 = new Person("Bob", 28, 7);



        CalcThings calc1 = new CalcThings();

        calc1.calcWisdom(person1);
        calc1.calcWisdom(person2);
        calc1.calcWisdom(person1);

        if(person1.getWisdom()< person2.getWisdom()){
            System.out.println(person2.getName() + " is wiser than " + person1.getName());
        }else if(person1.getWisdom() > person2.getWisdom()){
            System.out.println(person1.getName() + " is wiser than " + person2.getName());
        }else{
            System.out.println(person2.getName() + " and " + person1.getName() + "are equally wise, weird");

        }


    }


}

class Person{
    private String name;
    private int age;
    private int level;
    private int wisdom;

    Person(String name, int age, int level){

        this.name = name;
        this.age = age;
        this.level = level;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
}
class CalcThings{

    public void calcWisdom(Person obj){
        int calculatedWisdom;

        calculatedWisdom = obj.getAge()* obj.getLevel();

        if(calculatedWisdom != obj.getWisdom()){

            obj.setWisdom(calculatedWisdom);

            System.out.println(obj.getName() + ", your wisdom value has been updated to " + calculatedWisdom);

        }else{
            System.out.println(obj.getName() + ", your wisdom value was not updated, because it has not changed since your last calculation");
        }

    }



}