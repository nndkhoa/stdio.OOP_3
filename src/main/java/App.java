import entities.*;

public class App {
  public static void main(String[] args) {
    int n = 10;
    Shape[] list = new Shape[n];
    for (int i = 0; i < n; i++) {
      int type = random(0, 4);
      list[i] = createShape(type);
      list[i].fromConsole();
    }

    double total = 0;
    for (int i = 0; i < n; i++) {
      total += list[i].calculateArea();
    }

    int pricePerUnit = 1000;
    System.out.format("Total = %f\n", total * pricePerUnit);

    // Shape d = new Diamond();
    // d.calculateArea();
  }

  private static Shape createShape(int type) {
    switch (type) {
      case 1:
        return new Square();

      case 2:
        return new Rectangle();

      case 3:
        return new Circle();

      case 4:
        return new Triangle();

      default:
        return null;
    }
  }

  private static int random(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min) + min);
  }
}
