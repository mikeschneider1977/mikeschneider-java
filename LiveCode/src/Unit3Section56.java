public class Unit3Section56 {
    public static void main(String [] args){
        //outer loop
        for (int i = 0; i < 10; i++) {
            //print leading spaces
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            //print backslash
            for (int k = 10; k > i; k --)
                System.out.print("\\");
            //print forward slash
            for (int k = 10; k > i; k--)
                System.out.print("/");
            System.out.println();
        }
    }
}
