public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw(); // Drawing a Circle

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw(); // Drawing a Square
    }
}
