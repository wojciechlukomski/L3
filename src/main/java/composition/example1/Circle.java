package composition.example1;

public class Circle {
    Operation operation;
    double pi = 3.14d;

    double area (int radius){
        operation = new Operation();
        int rsquare = operation.square(radius);
        return pi*rsquare;

    }

}
