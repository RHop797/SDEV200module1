public class Conversion {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    
    public static void main(String[] args) {
       

        /**feet to meters table */
        System.out.println("Feet to Meters Conversion Table");
        System.out.println("-------------------------------");
        System.out.printf("%-10s%-10s%n", "Feet", "Meters");
        for (int foot = 1; foot <= 10; foot++) {
            double meter = footToMeter(foot);
            System.out.printf("%-10d%-10.3f%n", foot, meter);
        }
        
        System.out.println(); // Blank line for separation
        
        /**meters to feet table starting at 20 and incrementing by 5 up to 65 */
        System.out.println("Meters to Feet Conversion Table");
        System.out.println("-------------------------------");
        System.out.printf("%-10s%-10s%n", "Meters", "Feet");
        for (int meter = 20; meter <= 65; meter += 5) {
            double foot = meterToFoot(meter);
            System.out.printf("%-10d%-10.3f%n", meter, foot);
        }
    }
}

