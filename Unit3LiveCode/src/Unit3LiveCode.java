
public class Unit3LiveCode {

    public static void main(String[] args) {
        System.out.println("start");

        System.out.println(Math.min(Math.min(6,7),8));

        System.out.println(slope(1,3,5,7));

        double aSlope = slope(1,3,5,7);

        System.out.println(aSlope);

        double aHypotenuse = hypotenuse(3,4);

        System.out.println(aHypotenuse);

        System.out.println(myString(0));

    }
    public static double slope(int x1, int y1, int x2, int y2){
        System.out.println("slope");

        double y = y2 - y1;
        double x = x2 - x1;

        return y/x;
    }

    public static double hypotenuse(double a, double b){
        System.out.println("hypotenuse");

        double x = Math.pow(a,2);
        double y = Math.pow(b,2);

        double c = Math.sqrt(x + y);

        return c;


    }
    public static String myString(int x){
        if(x > 0) {
            return ("postive");
        } else if (x < 0) {
            return ("negative");
        }else {
            return ("zero");
        }
    }
}
