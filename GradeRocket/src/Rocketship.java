public class Rocketship {
    public static final int SZ = 3;

    public static void main(String[] args) {

        drawCone();
        Drawline();
        drawTop();
        drawBottom();
        Drawline();
        drawBottom();
        drawTop();
        Drawline();
        drawCone();

    }


    public static void drawCone() {
        for (int i = 0; i < SZ; i++) {
            for (int k = i; k < SZ-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/");

            }
            System.out.print("**");

            for (int h = 0; h <= i; h++) {
                System.out.print("\\");

            }

            System.out.println();

        }
    }
    //Generate the cone for the rocket
    public static void Drawline(){
        System.out.print("+");
        for(int i = 0; i< SZ; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }


    public static void drawTop() {
        for (int i = 0; i < SZ; i++) {
            System.out.print("|");
            for (int k = 0; k < SZ-i-1; k++) {
                System.out.print(".");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");

            }



            for(int w=1; w<2; w++){
                for (int k = 0; k < SZ-i-1; k++) {
                    System.out.print(".");
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");

            }
            for (int k = i; k < 1; k++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();

        }
    }
    public static void drawBottom(){

        for( int i = 0; i< SZ; i++){
            System.out.print("|");
            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            for (int j = i; j <=2; j++) {
                System.out.print("/\\");

            }
            for (int k =0; k<i ; k++) {
                System.out.print(".");

            }

            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            for (int j = i; j <=2; j++) {
                System.out.print("/\\");

            }
            for (int k =0; k < i; k++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();


        }
    }

}