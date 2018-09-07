public class DrawBoxes {
    public static void main(String[] args){
        System.out.println("Draw some boxes\n");

        drawBox();
        drawBox();
        drawBox();

        System.out.println("\nEnd of boxes");
    }

    public static void drawBox(){
        drawTopBot();
        drawSides();
        drawSides();
        drawTopBot();
    }

    public static void drawTopBot(){
        System.out.println("+----------+");
    }

    public static void drawSides(){
        System.out.println("|          |");
    }

}
