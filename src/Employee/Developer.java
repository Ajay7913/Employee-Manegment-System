package Employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String department, double salary, String programmingLanguage) {
        super(name, department, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
