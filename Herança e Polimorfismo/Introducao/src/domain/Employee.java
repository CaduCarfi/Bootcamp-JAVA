package domain;

public sealed abstract class Employee permits Manager, Salesman {

    protected String code;
    protected String name;
    protected String address;
    protected int age;
    protected double salary;

    public Employee(String address, int age, String code, String name, double salary) {
        this.address = address;
        this.age = age;
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(int i) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }

    public double getFullSalary(double exta, double extra2) {
        return this.getFullSalary() + exta + extra2;
    }
}
