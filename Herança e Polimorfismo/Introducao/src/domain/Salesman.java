package domain;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private double soldAmount;

    public Salesman(String address, int age, String code, String name, double salary, double percentPerSold,  double soldAmount) {
        super(address, age, code, name, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {

    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold) / 100;
    }
}
