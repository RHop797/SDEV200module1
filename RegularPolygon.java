/* 
+-----------------+
| RegularPolygon |
+-----------------+
|- n: int = 3    |
|- side: double = 1 |
|- x: double = 0  |
|- y: double = 0  |
+-----------------+
+-----------------+
| + RegularPolygon()                  |
| + RegularPolygon(n: int, side: double) |
| + RegularPolygon(n: int, side: double, x: double, y: double) |
| + getN(): int                      |
| + setN(n: int): void               |
| + getSide(): double                |
| + setSide(side: double): void      |
| + getX(): double                   |
| + setX(x: double): void            |
| + getY(): double                   |
| + setY(y: double): void            |
| + getPerimeter(): double           |
| + getArea(): double                |
+-----------------+
*/

public class RegularPolygon {
    // Data fields
    private int n = 3;          // Number of sides (default is 3)
    private double side = 1;   // Length of each side (default is 1)
    private double x = 0;      // x-coordinate of center (default is 0)
    private double y = 0;      // y-coordinate of center (default is 0)

    // No-arg constructor
    public RegularPolygon() {
    }

    // Constructor with number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Constructor with number of sides, side length, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
