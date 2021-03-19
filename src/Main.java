import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cooker cooker = new Cooker("Raushan");
        Cooker cooker2 = new Cooker("Rauan");
        Cooker cooker3 = new Cooker("Inkar");
        Driver driver = new Driver("Kuanysh");
        Driver driver2 = new Driver("Kuan");
        Driver driver3 = new Driver("Duman");
        Programmist programmist = new Programmist("Ershon");
        Programmist programmist2 = new Programmist("Jansaya");
        Programmist programmist3 = new Programmist("Janerke");
        ArrayList<Employees> employees = new ArrayList<>();
        employees.add(programmist);
        employees.add(programmist2);
        employees.add(programmist3);
        employees.add(cooker);
        employees.add(cooker2);
        employees.add(cooker3);
        employees.add(driver);
        employees.add(driver2);
        employees.add(driver3);
        for (Employees employee : employees) {
            employee.voice();
        }
        ArrayList<CodWritable> programmers = new ArrayList<>();
        programmers.add(programmist);
        programmers.add(programmist2);
        programmers.add(programmist3);
        for (CodWritable programmer : programmers) {
            programmer.writeCod();
        }

    }
}
