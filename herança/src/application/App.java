import entities.Rectangle;
import entities.Shape;
import entities.Circle;

public class App {
    public static void main(String[] args) throws Exception {

        Shape r1 = new Rectangle("Azul", 2.0, 3.0);

        System.out.println(r1.area());

        Shape c1 = new Circle("Branca", 1.0);

        Rectangle[] Geometria = new Rectangle[10];

        System.out.println(c1.area());
        // Shape r2 = new Square(cor, lado);

        double a = (double)2;
    }
}
