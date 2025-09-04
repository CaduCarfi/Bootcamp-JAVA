import java.time.OffsetDateTime;

public class Person {

    private final String name;
    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name, int age) {
        this.age = 1;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void incAge() {
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age++;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

}
