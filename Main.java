public class Main {

    public static float R = 6371;

    public static void main(String[] args) {
	// write your code here
        double d1 = findDistance(convertRadians(39),convertRadians(36),convertRadians(74),convertRadians(74));
        double d2 = findDistance(convertRadians(36),convertRadians(34),convertRadians(74),convertRadians(74));
        double d3 = findDistance(convertRadians(34),convertRadians(32),convertRadians(74),convertRadians(73));
        double d4 = findDistance(convertRadians(32),convertRadians(27),convertRadians(73),convertRadians(70));
        double d5 = findDistance(convertRadians(27),convertRadians(25),convertRadians(70),convertRadians(65));
        double d6 = findDistance(convertRadians(25),convertRadians(23),convertRadians(65),convertRadians(56));
        double d7 = findDistance(convertRadians(23),convertRadians(21),convertRadians(56),convertRadians(46));
        double d8 = findDistance(convertRadians(21),convertRadians(19),convertRadians(46),convertRadians(35));
        double d9 = findDistance(convertRadians(19),convertRadians(20),convertRadians(35),convertRadians(27));
        double d10 = findDistance(convertRadians(20),convertRadians(21),convertRadians(27),convertRadians(24));
        double d11 = findDistance(convertRadians(21),convertRadians(23),convertRadians(24),convertRadians(20));
        double d12 = findDistance(convertRadians(23),convertRadians(25),convertRadians(20),convertRadians(15));

        System.out.printf("The total distance is %.0f Kilometers",d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12);

    }

    public static double findDistance (double lat1, double lat2, double lon1, double lon2) {
        double a = Math.pow(Math.sin((lat2-lat1)/2),2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((lon2-lon1)/2),2);
        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        return R * c;
    }

    public static double convertRadians (double degrees) {
        return degrees * (Math.PI/180);
    }
}
