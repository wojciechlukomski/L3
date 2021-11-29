package composition.example2;

public class Employee {
    int id;
    Credentials credentials;
    Adress adress;
    PermitionType permitionType;

    public Employee(int id, Credentials credentials, Adress adress, PermitionType permitionType) {
        this.id = id;
        this.credentials = credentials;
        this.adress = adress;
        this.permitionType = permitionType;
    }
}
