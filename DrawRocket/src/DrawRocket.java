// Program to draw a rocketship using static methods and for loops.  Change
// the value of the SUB_HEIGHT constant to scale the ship to a different
// size.

public class DrawRocket {
    public static final int SUB_HEIGHT = 3;

    public static void main(String[] args) {
        drawCone();
        drawLine();
        drawHalf1();
        drawHalf2();
        drawLine();
        drawHalf2();
        drawHalf1();
        drawLine();
        drawCone();
    }

    public static void drawCone() {
        for (int line = 1; line <= 2 * SUB_HEIGHT - 1; line++) {
        //for (int line = 1; line <= 5; line++) {

            for (int i = 1; i <= 2 * SUB_HEIGHT - line; i++) {
            //for (int i = 1; i <= 6 - line; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int i = 1; i <= line; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void drawLine() {
        System.out.print("+");
        for (int count = 1; count <= 2 * SUB_HEIGHT; count++) {
        //for (int count = 1; count <= 6; count++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void drawHalf1() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
        //for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= SUB_HEIGHT - line; i++) {
            //for (int i = 1; i <= 3 - line; i++) {
                System.out.print(".");
            }
            for (int count = 1; count <= line; count++) {
                System.out.print("/\\");
            }
            for (int i = 1; i <= 2 * SUB_HEIGHT - 2 * line; i++) {
            //for (int i = 1; i <= 2 * 3 - 2 * line; i++) {
                System.out.print(".");
            }
            for (int count = 1; count <= line; count++) {
                System.out.print("/\\");
            }
            for (int i = 1; i <= SUB_HEIGHT - line; i++) {
            //for (int i = 1; i <= 3 - line; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    public static void drawHalf2() {
        for (int line = SUB_HEIGHT; line >= 1; line--) {
        //for (int line = 3; line >= 1; line--) {
            System.out.print("|");
            for (int i = 1; i <= SUB_HEIGHT - line; i++) {
            //for (int i = 1; i <= 3 - line; i++) {
                System.out.print(".");
            }
            for (int count = 1; count <= line; count++) {
                System.out.print("\\/");
            }
            for (int i = 1; i <= 2 * SUB_HEIGHT - 2 * line; i++) {
            //for (int i = 1; i <= 2 * 3 - 2 * line; i++) {
                System.out.print(".");
            }
            for (int count = 1; count <= line; count++) {
                System.out.print("\\/");
            }
            for (int i = 1; i <= SUB_HEIGHT - line; i++) {
            //for (int i = 1; i <= 3 - line; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
}
