package Part_11_Others.Part_119_Reflection_1;

public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartment(String newDepartment) {
        this.department =  newDepartment;
        System.out.println("New department is: " + department);
    }
}
