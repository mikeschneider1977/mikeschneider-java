public class Unit2SectionII {

    public static final int WIDTH = 2;
    public static final int HEIGHT = 6;

    public static void main(String[] args) {
        fishInStream();
        getAverage();
        oneThruSeven();

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

    public static void getAverage() {
        int apBio = 11;
        int apChem = 4;
        int apCS = 28;
        int apEng = 37;
        int apSpan = 37;
        int num = 5;

        double av1 = (double) (apBio + apChem + apCS + apEng + apSpan) / num;
        double av2 = (apBio + apChem + apCS + apEng + apSpan) / (double) num;
        double av3 = ((double) apBio + apChem + apCS + apEng + apSpan) / num;

        System.out.println("The average AP class size is " + av1);
        System.out.println("The average AP class size is " + av2);
        System.out.println("The average AP class size is " + av3);
    }

    public static void oneThruSeven(){
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
