package composition.example1;

public class Example1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.area(5);
        System.out.println(area);
    }
}
