package entities;

public class Triangle extends Shape {
  private Point p1, p2, p3;

  public Triangle() {
  }

  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  @Override
  public void fromConsole() {
  }

  @Override
  public double calculateArea() {
    return 10; // chưa tính, xem như 10
  }
}
