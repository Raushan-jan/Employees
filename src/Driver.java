public class Driver  extends Employees implements Driveable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Вожу");
    }
}
