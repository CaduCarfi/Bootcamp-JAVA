package domain;

public non-sealed class Manager extends Employee{
    private String login;
    private String password;
    private double comission;

    public Manager(String address, int age, String code, String name, double salary, double comission, String login, String password) {
        super(address, age, code, name, salary);
        this.comission = comission;
        this.login = login;
        this.password = password;
    }

    public Manager() {

    }

    @Override
    public String getCode(){
        return "MN" + this.code;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }

}
