package homework;

public class Main {
    public static void main(String[] args) {

//        Employee employee = new Employee(1,"Rafal","mazurt","biezanowska",4000,"masterclass");
//        Product product = new Product(2800,4000,true,10.0d,"discount","super special");
//        Address address = new Address("Legionow",8,"krakow");

//        Store store1 = new Store("store1",40,"bla","cracov",employee,product,address);
        Store store = new Store("store",40,"bla","cracov",
                new Employee(1,"Rafal","mazurt","biezanowska",4000,"masterclass"),
                new Product(2800,4000,true,10.0d,"discount","super special"),
                new Address("Legionow",8,"krakow"));

//        Store store2 = new Store("bike",40,"bla","cracov",Employee,store.productTest,store.addressTest);

//        System.out.println(store); // ktora wersja poprawna? store czy store 1
//        System.out.println(store1);
        System.out.println(store);
        // JAK ODWOLAC SIE DO OBIEKTU W KLASIE STORE? OBIEKT EMPLOYMENT TEST??

    }
}
//new Employee(1,"Rafal","mazurt","biezanowska",4000,"masterclass"),
//
//