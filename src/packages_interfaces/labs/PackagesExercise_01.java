package packages_interfaces.labs;

import packages_interfaces.labs.package_01.Class_01;
import packages_interfaces.labs.package_02.Class_02;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

public class PackagesExercise_01 extends Class_02{


    public static void main(String[]args){
        PackagesExercise_01 pkgExercise = new PackagesExercise_01();
        Class_01 class01 = new Class_01();
        Class_02 class02 = new Class_02();

        class01.method01();
     // this is not legal because it is protected and Class01 is in a different package, did not import, and not a subclass of PackagesExercise_01 ->   class01.method02();
        class02.method03();
    // Not legal    class02.method04();
        pkgExercise.method04(); // This is legal because PackagesExercise_01 class is a subclass of Class_02
    }
}
