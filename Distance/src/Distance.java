public class Distance {

        public static void main(String[] args) {

            // tacoma 16,10
            // gig harbor 4,28
            double city2 = distance(16, 10, 4, 28);
            System.out.println("The Distance between city 1 and city 2: " + city2);

            // gig harbor 4,28
            // auburn 21,21
            double city3 = city2 + distance(4,28,21,21);
            System.out.println("The Distance between city1 and city 2 and city 3: " + city3);

            // auburn 21, 21
            // tacoma 16, 10
            double totalTrip = city3 + distance(21,21,16,10);
            System.out.println("The distance between city1 and city2 and city3 and back to city1: " + totalTrip);
        }

        public static double distance(int x1, int y1, int x2, int y2) {
            double calcDistance = 0, xDistance = 0, yDistance = 0;

            xDistance = Math.pow((x2 - x1), 2);

            yDistance = Math.pow((y2 - y1), 2);

            calcDistance = Math.sqrt(xDistance + yDistance);

            return calcDistance;
        }

}
