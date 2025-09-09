import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary(500));
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setCode("153253");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);


                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary(500));
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary(500));
        System.out.println(employee.getFullSalary());
        System.out.println("==============\n");
    }
}