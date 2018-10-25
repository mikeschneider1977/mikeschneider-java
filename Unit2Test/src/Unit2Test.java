public class Unit2Test {
    public static void main(String[] args){
        // #4
        System.out.println((5 + 7) % 8);

        // #7
        int x = 1;
        x++;
        x++;
        x *= 3;
        x++;
        System.out.println(x);

        // #8
        int xx = 1;
        int y = 8;
        int z = xx + y;
        xx = z / 4;
        y = xx + 1;
        z += y;
        System.out.println(z);

        // #9
        System.out.println((1 + 2.0 + 3) / 4);

        // #10
        System.out.println( 1 + 2 + 3 + "4" + 5 + 6 * 2 );

        // #11
        for (int i = 2; i < 8; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println("Whom do we appreciate?");

        // #12
        int xxx = 1;
        double yy = xxx;
        yy = yy / 2;
        int zz = (int)(yy + 1.6);
        System.out.println(zz);

        // #13
        for (int i = 1; i <= 3; i++)
            System.out.println("Hey");
        System.out.println("ya!");

        // #14
        loopStars();
    }

    // #14
    public static void printStar() {
        System.out.println(" * ");
    }

    // #14
    public static void loopStars() {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= i; j++) {
                printStar();
            }
        }
    }
}
