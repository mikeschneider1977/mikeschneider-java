public class PracticeTestSectionTwo {
    public static void main(String[] args){
        drawHashTagsAndAtta();
        System.out.println();
        fireInLondon();

    }
    public static void drawHashTagsAndAtta(){
         drawAtta();
         drawAtta();
         System.out.println();
         drawHashTags();
         drawHashTags();
         System.out.println();
         drawAtta();
         drawHashTags();
    }
    public static void drawAtta(){
        System.out.print("@@@@@@ ");
    }
    public static void drawHashTags(){
        System.out.print("###### ");
    }

    public static void fireInLondon(){
        londonsBurning();
        fetchEngines();
        System.out.println("\n");
        fire();
        fire();
        System.out.println("\n");
        fetchEngines();
        londonsBurning();
        System.out.println("\n");
        fire();
    }
    public static void londonsBurning(){
        System.out.print("London's Burning, ");
    }
    public static void fetchEngines(){
        System.out.print("Fetch the engines, ");
    }
    public static void fire(){
        System.out.print("FIRE!, ");
    }
}
