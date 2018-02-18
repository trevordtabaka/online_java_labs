package exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise07{

    public static void main(String[] args) throws ExceptionForFriends {

        Person Dave = new Person("Dave", false);
        Person Erik = new Person("Erik",true);
        Person Rikke = new Person("Rikke",true);


        Person[] peeps = {Dave, Erik,Rikke};
        System.out.println(peeps.toString());
        for(Person human: peeps){
            try {
                System.out.println(human.name + " isFriend " +human.isFriend);

                if (human.isFriend) {
                    throw new ExceptionForFriends(human);
                }
            }catch(ExceptionForFriends friend){

                System.out.println(human.name + " was let in.");
            }
        }
    }

}

class ExceptionForFriends extends Exception{

    public ExceptionForFriends(Person human) {
        System.out.println(human.name + " is a Friend. They can come in.");
    }
}