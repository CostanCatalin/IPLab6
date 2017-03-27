
public class GeometryUtility {
    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt( Math.pow(p1.getX() - p1.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
