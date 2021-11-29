package composition.example2;

public class Example2 {

    public static void main(String[] args) {
        Employee employee = new Employee(1,new Credentials(),new Adress(),PermitionType.FULL_ACCESS );
        employee.credentials.getName();
    }
}
