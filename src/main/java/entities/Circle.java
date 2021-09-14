package entities;

public class Circle extends Shape {
  private Point center;
  private int radius;

  public Circle() {
  }

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public void fromConsole() {
  }

  @Override
  public double calculateArea() {
    return Math.PI * this.radius * this.radius;
  }
}
