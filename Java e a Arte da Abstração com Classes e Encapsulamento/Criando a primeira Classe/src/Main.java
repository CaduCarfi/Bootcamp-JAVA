
public class Main {
    public static void main(String[] args) {
        var male = new Person("Arrascaeta", 18);

        var female = new Person("Gabi", 19);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }
}