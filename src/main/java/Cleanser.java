public class Cleanser {
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();

    }
}
