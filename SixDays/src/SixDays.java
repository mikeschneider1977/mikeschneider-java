
/*
 *****************************************************
 * Mike Schneider
 * AP CS A
 * Period 1
 * September 10, 2018
 * Project #1 - SixDays of Xmas
 *****************************************************
 */

public class SixDays {
    public static void main(String[] args){

        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();

    }

    // verse and gift 1 partridge
    public static void verse1(){
        System.out.println("\nOn the 1st day of \"Xmas\" my true love gave to me");
        gift1();
    }
    public static void gift1(){
        System.out.println("a partridge in a pear tree.\n");
    }

    // verse and gift 2 doves
    public static void verse2(){
        System.out.println("On the 2nd day of \"Xmas\" my true love gave to me");
        gift2();
    }
    public static void gift2(){
        System.out.println("two turtle doves and");
        gift1();
    }

    // verse and gift hens
    public static void verse3(){
        System.out.println("On the 3rd day of \"Xmas\" my true love gave to me");
        gift3();
    }
    public static void gift3(){
        System.out.println("three french hens,");
        gift2();
    }

    // verse and gift 4 birds
    public static void verse4(){
        System.out.println("On the 4th day of \"Xmas\" my true love gave to me");
        gift4();
    }
    public static void gift4(){
        System.out.println("four calling birds,");
        gift3();
    }

    // verse and gift 5 rings
    public static void verse5(){
        System.out.println("On the 5th day of \"Xmas\" my true love gave to me");
        gift5();
    }
    public static void gift5(){
        System.out.println("five golden rings,");
        gift4();
    }

    // verse and gift 6 geese
    public static void verse6(){
        System.out.println("On the 6th day of \"Xmas\" my true love gave to me");
        gift6();
    }

    public static void gift6(){
        System.out.println("six geese a-laying,");
        gift5();
    }
}
