
public class TestRegularPolygon {
    public static void main(String[] args) {
        // Create RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area for each polygon
        displayPolygonInfo("Polygon 1", polygon1);
        displayPolygonInfo("Polygon 2", polygon2);
        displayPolygonInfo("Polygon 3", polygon3);
    }

    public static void displayPolygonInfo(String name, RegularPolygon polygon) {
        System.out.println(name + ":");
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.println("Area: " + polygon.getArea());
        System.out.println();
    }
}
