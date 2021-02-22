package snappy.dev.env

public class App {
    public String getGreeting() {
        Greeter greet = new Greeter();
        return greet.sayHello();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
