public class Unit1Test {
    public static void main(String[] args){
        many();
        printStar();
        many();
    }

    public static void printStar(){
        System.out.println(" * ");
    }

    public static void twice(){
        printStar();
        printStar();
    }

    public static void many(){
        twice();
        twice();
        printStar();
    }
}
