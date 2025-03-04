package interfaces.Reuso;

public class Application {
    public static void main(String[] args) {

        Shape s1 = new Circle(Color.BLACK, 2);
        Shape s2 = new Rectangle(Color.WHITE, 3, 4);

        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
        System.out.println("Rectangle color: " + s2.getColor());
    }
}
