public class UnitOneTestSectionTwo {

    public static void main(String[] args) {
        fishInStream();
        System.out.println();
        System.out.println();
        singSong();

    }

    public static void fishInStream() {
        drawWater();
        drawFish();
        drawWater();
        drawFish();
        System.out.println();
        drawFish();
        drawWater();
        drawFish();

    }
    public static void drawWater(){
        System.out.print("water");
    }

    public static void drawFish(){
        System.out.print("fish");
    }

    public static void singSong(){
        losHombres();
        losHombres();
        System.out.println();
        huh();
        losHombres();
        losHombres();
        System.out.println();
        huh();
        System.out.println("Ha ha ha ha!");
        losHombres();
        System.out.println();
        huh();
    }

    public static void losHombres(){
        System.out.println("Los hombres no lloran.");
    }

    public static void huh(){
        System.out.println("Huh!\n");
    }
}
