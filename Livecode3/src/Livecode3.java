import java.util.Scanner;

public class Livecode3 {

    public static void main(String[] args) {

        System.out.println("start");

        Scanner cInput = new Scanner(System.in);

        /*System.out.println("enter a num - ");

        int num1 = cInput.nextInt();

        System.out.println("enter a num - ");

        int num2 = cInput.nextInt();

        System.out.println(num1 + num2);*/

        System.out.println("enter a string - ");

        String s1 = cInput.next();

        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println(s1.substring(0,2));

        System.out.println(s1.charAt(3));

        //System.out.println(s1.charAt(6));

        System.out.println(s1.charAt(s1.length()-1));




    }
}