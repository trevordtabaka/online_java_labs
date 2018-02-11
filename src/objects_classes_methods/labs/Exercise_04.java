package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Calculator{

    public static void main(String[] args) {
        Calculator newCalc = new Calculator();


        newCalc.displayAnswer(newCalc.addCalculator(7,12));
        newCalc.displayAnswer(newCalc.addCalculator(7,12.0));

        newCalc.displayAnswer(newCalc.multiplyCalculator(7,12));
        newCalc.displayAnswer(newCalc.multiplyCalculator(7,12, 6.2));

        newCalc.displayAnswer(newCalc.divideCalculator(8,4));
        newCalc.displayAnswer(newCalc.divideCalculator(101.7, 22.7));

    }

    public void displayAnswer(int int1){

        System.out.println(int1);

    }
    public void displayAnswer(double dub1){

        System.out.println(dub1);

    }


    public int addCalculator(int int1, int int2){

        System.out.println("You are using the int add calculator for 2 ints");

        return int1+int2;

    }

    public double addCalculator(int int1, double dub1){
        System.out.println("You are using the double add calculator for 1 int and one double value");
        return int1 + dub1;

    }
    public int addCalculator(int int1, int int2, int int3){
        System.out.println("You are using the int add calculator for 3 ints");
        return int1+int2+int3;
    }

    public double multiplyCalculator(double dub1, double dub2){
        System.out.println("You are using the double multiply calculator for 2 double values");
        return dub1 * dub2;

    }
    public double multiplyCalculator(double dub1, double dub2, double dub3){
        System.out.println("You are using the double multiply calculator for 3 double values");
        return dub1 * dub2 * dub3;

    }

    public double divideCalculator(int int1, int int2){
        System.out.println("You are using the int divide calculator for 2 int values");
        return int1 / int2;

    }
    public double divideCalculator(double dub1, double dub2){
        System.out.println("You are using the double divide calculator for 2 double values");
        return dub1 / dub2;

    }



}
