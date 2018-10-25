public class Shortcuts {

    public static final int WIDTH = 2;
    public static final int HEIGHT = 6;

    public static void main(String[] args) {
        fishInStream();

    }

    public static void fishInStream(){
        for(int i = 1; i <= HEIGHT; i++){
            for(int j = 1; j <= WIDTH; j++) {
                drawFishAndWater();
            }
            System.out.println();
        }

    }

    public static void drawFishAndWater(){
        System.out.print(" water fish");
    }

}
